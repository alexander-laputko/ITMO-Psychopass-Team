package org.civilla.common;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Helpers {
    public static boolean inArrayLower(String str, String[] arr){
        for (String s: arr)
            if (s.toLowerCase().equals(str.toLowerCase()))
                    return true;
        return false;
    }

    public static String readInputStream(InputStream stream, int bufferSize){
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[bufferSize];
        int length;
        try {
            while ((length = stream.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            String res = result.toString("UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static JSONObject readJson(String filepath) {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(filepath));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return (JSONObject) obj;
    }

    public static JSONObject stringToJson(String jsonString) {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (JSONObject) obj;
    }

}
