package arep;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SparkAPI {

    public static void main(String[] args) {

        staticFiles.location("/static");
        Gson gson = new Gson();
        port(getPort());
        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
        // after((Filter) (request, response) -> {
        // response.header("Access-Control-Allow-Origin", "*");
        // response.header("Access-Control-Allow-Methods", "*");
        // });
        System.out.println("ya?");
        

        post("/val", (req, res) -> {
            int a = Integer.parseInt(req.body().split(":")[2]);
            return gson.toJson(makeRequest(a));

        });
    }

    private static String makeRequest(int val)  throws IOException {
        URL urlForGetRequest = new URL("https://1js0501l0i.execute-api.us-east-1.amazonaws.com/beta?value="+val);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        int responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            return response.toString();
        } else {
            System.out.println("error on petition making");
        }
        return null;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
        }

}