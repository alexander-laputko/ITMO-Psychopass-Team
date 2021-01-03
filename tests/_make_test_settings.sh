cat <<EOF
{
    "app_id": "`sops -d secrets/test_app.json | jq -r .app_id`",
    "app_hash": "`sops -d secrets/test_app.json | jq -r .app_hash`",
    "connection_string": "`cat tests/conn.json | jq -r .connection_string`",
    "bot_name": "`sops -d secrets/kube_secrets.json | jq -r .$STAGE.bot_name`",
    "mongo_host": "localhost:27017",
    "devices_server_host": "localhost:30000"
}
EOF
