package pl.qubiak.weather.map.ReadData.ReadJsonWeatherData;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pl.qubiak.weather.map.Model.Point;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadJsonWeatherData {

    public static ArrayList<Point> deserializationJson() {

        String weatherJson = downloadJsonFromUrl("https://danepubliczne.imgw.pl/api/data/synop");
        Gson gson = new Gson();

        Type userListType = new TypeToken<ArrayList<Point>>() {
        }.getType();
        ArrayList<Point> weatherArray = gson.fromJson(weatherJson, userListType);
        //System.out.println(weatherArray.get(0).toString());
        return weatherArray;
    }

    public static String downloadJsonFromUrl(String weatherJson) {
        try {
            URL myUrl = new URL(weatherJson);
            StringBuilder jsonText = new StringBuilder();
            try (InputStream myInputStream = myUrl.openStream();
                 Scanner scanner = new Scanner(myInputStream)) {
                while (scanner.hasNextLine()) {
                    jsonText.append(scanner.nextLine());
                }
                //System.out.println(jsonText.toString());
                return jsonText.toString();
            }
        } catch (IOException e) {
            System.err.println("Failed to get content from URL " + weatherJson + " due to exception: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
