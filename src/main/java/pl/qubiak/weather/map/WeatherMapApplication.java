package pl.qubiak.weather.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.qubiak.weather.map.ReadData.ReadCoordinates.ReadCoordinates;
import pl.qubiak.weather.map.ReadData.ReadJsonWeatherData.ReadJsonWeatherData;

import java.io.IOException;

@SpringBootApplication
public class WeatherMapApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WeatherMapApplication.class, args);

		//ReadCoordinates.ReadCoordinatesFromFile();
		//ReadJsonWeatherData.deserializationJson();
	}
}
