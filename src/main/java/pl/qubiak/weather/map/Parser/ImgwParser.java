package pl.qubiak.weather.map.Parser;

import org.springframework.stereotype.Service;
import pl.qubiak.weather.map.Model.CoOrdinates;
import pl.qubiak.weather.map.Model.Point;
import pl.qubiak.weather.map.ReadData.ReadCoordinates.ReadCoordinates;
import pl.qubiak.weather.map.ReadData.ReadJsonWeatherData.ReadJsonWeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImgwParser {

    public ArrayList<Point> addCoordinatesToPoint() {

        ArrayList<CoOrdinates> coOrdinatesArrayList = ReadCoordinates.ReadCoordinatesFromFile();
        ArrayList<Point> points = ReadJsonWeatherData.deserializationJson();

        for (int i = 0; i < points.size(); i++) {
            //TODO stream.filter()

            if (points.get(i).getStationName().equals(coOrdinatesArrayList.get(i).getRegion())) {
                points.get(i).setLat(coOrdinatesArrayList.get(i).getLat());
                points.get(i).setLon(coOrdinatesArrayList.get(i).getLon());
            } else {
                System.err.println("Check data range (file - JSON from URL)");
                System.exit(3);
            }
        }

        return points;
    }
}



