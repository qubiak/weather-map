package pl.qubiak.weather.map.Parser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import pl.qubiak.weather.map.Model.Poit;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class ImgwParser<weatherArray> {

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
            return null;
        }
    }

    public List<Poit> getWeatherData() throws IOException {

        List<Poit> poits = new ArrayList<>();

        for (Poit poit : weatherArray) {

            String id_stacji = weatherArray.get(0).getId_stacji();
            String stacja = poit.getStacja();
            String data_pomiaru = poit.getData_pomiaru();
            String godzina_pomiaru = poit.getGodzina_pomiaru();
            String temperatura = poit.getTemperatura();
            String predkosc_wiatru = poit.getPredkosc_wiatru();
            String kierunek_wiatru = poit.getKierunek_wiatru();
            String wilgotnosc_wzgledna = poit.getWilgotnosc_wzgledna();
            String suma_opadu = poit.getSuma_opadu();
            String cisnienie = poit.getCisnienie();


        }
        for( int i = 0; i < weatherArray.size(); i++) {
            System.out.println(weatherArray.get(i).getStacja());
        }
        /* TODO
        baza ze współrzędnymi miast (lat, long) do zaznaczenia na mapie
         */


        return poits;
    }

}


