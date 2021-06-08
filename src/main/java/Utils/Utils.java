package Utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
    public static JSONObject readJSON(String filePath) {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        try (InputStream is = Utils.class.getResource(filePath).openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            try {
                jsonObject = (JSONObject) jsonParser.parse(reader);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
