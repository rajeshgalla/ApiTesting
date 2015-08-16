package com.rajesh.galla.utils;

import org.apache.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

/**
 * Created by rajeshgalla on 8/10/15.
 */
public class Utilities {
    public static String getEmailID() throws IOException {

        return ResourceHandler.getResource("emailid");
    }

    public static String getName() throws IOException {

        return ResourceHandler.getResource("name");
    }

    public static JSONObject getJSONFromResponse(HttpResponse response) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
        String json = reader.readLine();
        JSONTokener tokener = new JSONTokener(json);
        JSONObject finalResult = new JSONObject(tokener);
        return finalResult;
    }
}
