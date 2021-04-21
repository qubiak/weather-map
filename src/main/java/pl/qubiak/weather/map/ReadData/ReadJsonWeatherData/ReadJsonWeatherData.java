package pl.qubiak.weather.map.ReadData.ReadJsonWeatherData;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pl.qubiak.weather.map.Model.Poit;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadJsonWeatherData {

    private static final String weatherJson = downloadJsonFromUrl("https://danepubliczne.imgw.pl/api/data/synop");
    Gson gson = new Gson();

    Type userListType = new TypeToken<ArrayList<Poit>>() {
    }.getType();
    ArrayList<Poit> weatherArray = gson.fromJson(weatherJson, userListType);


    public static String downloadJsonFromUrl(String urlWithData) {
        try {
            URL myUrl = new URL(urlWithData);
            StringBuilder jsonText = new StringBuilder();
            try (InputStream myInputStream = myUrl.openStream();
                 Scanner scanner = new Scanner(myInputStream)) {
                while (scanner.hasNextLine()) {
                    jsonText.append(scanner.nextLine());
                }
                return jsonText.toString();
            }
        } catch (IOException e) {
            System.err.println("Failed to get content from URL " + urlWithData + " due to exception: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
