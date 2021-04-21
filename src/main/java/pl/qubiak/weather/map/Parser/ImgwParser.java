package pl.qubiak.weather.map.Parser;

import org.springframework.stereotype.Service;
import pl.qubiak.weather.map.Model.Poit;
import pl.qubiak.weather.map.ReadData.ReadCoordinates.ReadCoordinates;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImgwParser {

    public List<Poit> getWeatherData() throws IOException {

        List<Poit> poits = new ArrayList<>();


        for( int i = 0; i < poits.size(); i++) {


        //    double lat = ReadCoordinates.ReadCoordinatesFromFile();
        //    double along = ReadCoordinates.ReadCoordinatesFromFile();

            String id_stacji = poits.get(i).getId_stacji();
            String stacja = poits.get(i).getStacja();
            String data_pomiaru = poits.get(i).getData_pomiaru();
            String godzina_pomiaru = poits.get(i).getGodzina_pomiaru();
            String temperatura = poits.get(i).getTemperatura();
            String predkosc_wiatru = poits.get(i).getPredkosc_wiatru();
            String kierunek_wiatru = poits.get(i).getKierunek_wiatru();
            String wilgotnosc_wzgledna = poits.get(i).getWilgotnosc_wzgledna();
            String suma_opadu = poits.get(i).getSuma_opadu();
            String cisnienie = poits.get(i).getCisnienie();


        //    poits.add(new Poit(lat, along, id_stacji, stacja, data_pomiaru, godzina_pomiaru, temperatura,
        //            predkosc_wiatru, kierunek_wiatru, wilgotnosc_wzgledna, suma_opadu, cisnienie));
        }



        return poits;
    }

}


