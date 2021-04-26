package pl.qubiak.weather.map.Parser;

import org.springframework.stereotype.Service;
import pl.qubiak.weather.map.Model.Poit;
import pl.qubiak.weather.map.ReadData.ReadCoordinates.ReadCoordinates;
import pl.qubiak.weather.map.ReadData.ReadJsonWeatherData.ReadJsonWeatherData;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImgwParser {

    public List<Poit> getWeatherPointAndData() {

        List<Poit> poits = new ArrayList<>();

        /*
        To mi się strasznie nei podoba. Założenie jest takie, że jest sobie lista z JSONa i jest lista z pliku.
        Kolejność się zgadza. Jeżeli JSON np łódź jest z indeksem 10 w w pliku txt jego koordynaty też są z takim indeksem.
        Trochę to nie fajne bo jak coś się zmieni to się wywali i nawet można tego nie zauważyć. Dlatego też w txt jest wpisany Region.
        Myślałem by to dołączyćjakoś typu jeżeli. Może podmienić. Coś jak napisane jest w Connection. Tylko nei wiem gdzie to wywołać :P
        Poratujesz coś.
         */

        for (int i = 0; i < ReadJsonWeatherData.deserializationJson().size(); i++) {

            String lat = ReadJsonWeatherData.deserializationJson().get(i).getLat();
            String along = ReadJsonWeatherData.deserializationJson().get(i).getAlong();

            String stationId = ReadJsonWeatherData.deserializationJson().get(i).getStationId();
            String stationName = ReadJsonWeatherData.deserializationJson().get(i).getStationName();
            String dateOfMeasurement = ReadJsonWeatherData.deserializationJson().get(i).getDateOfMeasurement();
            String timeOfMeasurement = ReadJsonWeatherData.deserializationJson().get(i).getTimeOfMeasurement();
            String temperature = ReadJsonWeatherData.deserializationJson().get(i).getTemperature();
            String windSpeed = ReadJsonWeatherData.deserializationJson().get(i).getWindSpeed();
            String windDirection = ReadJsonWeatherData.deserializationJson().get(i).getWindDirection();
            String relativeHumidity = ReadJsonWeatherData.deserializationJson().get(i).getRelativeHumidity();
            String rainfall = ReadJsonWeatherData.deserializationJson().get(i).getRainfall();
            String pressure = ReadJsonWeatherData.deserializationJson().get(i).getPressure();


            poits.add(new Poit(lat, along, stationId, stationName, dateOfMeasurement, timeOfMeasurement, temperature,
                    windSpeed, windDirection, relativeHumidity, rainfall, pressure));
        }
        return poits;
    }
}



