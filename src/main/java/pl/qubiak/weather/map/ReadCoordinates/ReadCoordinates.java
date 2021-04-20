package pl.qubiak.weather.map.ReadCoordinates;

import pl.qubiak.weather.map.Model.CoOrdinates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCoordinates {

    public static void ReadCoordinatesFromFile() throws IOException {

        FileReader fr = new FileReader("co-ordinates.txt");
        BufferedReader br = new BufferedReader(fr);


        String readLineFromFile = br.readLine().toString();
        String holder[] = readLineFromFile.split("-");
        String Region = holder[0];
        Double lat = Double.parseDouble(holder[1]);
        Double along = Double.parseDouble(holder[2]);

        System.out.println(Region);
        System.out.println(lat);
        System.out.println(along);


    }

}

