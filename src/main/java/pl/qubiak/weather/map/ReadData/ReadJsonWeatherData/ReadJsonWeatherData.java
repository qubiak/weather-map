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

    public static ArrayList<Poit> deserializationJson() {

        String weatherJson = downloadJsonFromUrl("https://danepubliczne.imgw.pl/api/data/synop");
        Gson gson = new Gson();

        Type userListType = new TypeToken<ArrayList<Poit>>() {
        }.getType();
        ArrayList<Poit> weatherArray = gson.fromJson(weatherJson, userListType);

        /*
        Tutaj dostaję błąd Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $ Nie bardzo rozumiem skąd.
        Oczekuję objektu a dostaję Stringa. Nie dostaję przecież jednego JSONa tylko wszystkie. Jak to rozumieć
        i jak to rozwiązać?
         */

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
                System.out.println(jsonText.toString());
                return jsonText.toString();
            }
        } catch (IOException e) {
            System.err.println("Failed to get content from URL " + weatherJson + " due to exception: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
