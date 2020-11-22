import org.asynchttpclient.Response;
import org.civilla.requests.AsyncHttpRequests;
import org.civilla.requests.RetryWrapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.civilla.common.Logging;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class LongPollHandler extends TelegramLongPollingBot {

    public JSONObject processUpdates(List<Update> updates){
        JSONArray updatesJson = new JSONArray();
        for (Update update : updates) {
            if (!update.hasMessage() || !update.getMessage().hasText())
                continue;
            JSONObject updateJson = new JSONObject();
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            boolean restricted = false;
            if (message_text.length() > getMaxMessageSize()){
                message_text = message_text.substring(0, getMaxMessageSize());
                restricted = true;
            }

            updateJson.put("restricted", restricted);
            updateJson.put("chat_id", chat_id);
            updateJson.put("message", message_text);
            updatesJson.put(updateJson);

            Logging.log.info(String.join(" ", "Incoming message:", message_text,
                    "From chat_id:", Long.toString(chat_id), restricted ? "Message was restricted!" : ""));
        }
        JSONObject result = new JSONObject();
        result.put("values", updatesJson);

        return result;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Implementation of library allows to use onUpdatesReceived only
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        JSONObject body = processUpdates(updates);
        RetryWrapper retriedRequest = new RetryWrapper(1000, 1, 5) {
            @Override
            public CompletableFuture<Response> action() {
                return AsyncHttpRequests.post(getBotServerUrl(), new HashMap<>(), body.toString());
            }
            @Override
            public boolean retryOnResult(CompletableFuture<Response> future) throws ExecutionException, InterruptedException {
                return future.get().getStatusCode() > 500;
            }
        };
        CompletableFuture<Response> future = retriedRequest.execute();
    }

    @Override
    public String getBotUsername() {
        return "Civilla_Bot";
    }

    @Override
    public String getBotToken() {
        return "1018032526:AAGvccDnJcHYl-jxbW_H1RWKuQQpmxY3gzQ";
    }

    public String getBotServerUrl() {
        return "http://127.0.0.1:8000/";
    }

    public int getMaxMessageSize() { return 50; }
}