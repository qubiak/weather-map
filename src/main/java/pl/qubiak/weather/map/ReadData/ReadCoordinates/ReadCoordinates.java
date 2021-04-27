package pl.qubiak.weather.map.ReadData.ReadCoordinates;

import pl.qubiak.weather.map.Model.CoOrdinates;

import java.io.*;
import java.util.ArrayList;

public class ReadCoordinates {


    public static ArrayList<CoOrdinates> ReadCoordinatesFromFile() {

        FileReader fileReader = null;
        String region;
        double lat;
        double lon;
        ArrayList<CoOrdinates> coOrdinatesArrayList = new ArrayList<>();

        try {
            fileReader = new FileReader("co-ordinates.txt");
        } catch (FileNotFoundException e) {
            System.out.println("error opening file co-ordinates.txt");
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String thisLine;
            while ((thisLine = bufferedReader.readLine()) != null) {

                String holder[] = thisLine.split("-");

                region = holder[0];
                lat = Double.parseDouble(holder[1]);
                lon = Double.parseDouble(holder[2]);

                coOrdinatesArrayList.add(new CoOrdinates(region, lat, lon));

            }


        } catch (IOException e) {
            System.out.println("error reading from the file");
            e.printStackTrace();
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("error closing the file");
            e.printStackTrace();
        }

        return coOrdinatesArrayList;
    }
}



