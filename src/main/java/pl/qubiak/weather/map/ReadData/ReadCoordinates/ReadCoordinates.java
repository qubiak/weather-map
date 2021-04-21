package pl.qubiak.weather.map.ReadData.ReadCoordinates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCoordinates {

    public static void ReadCoordinatesFromFile() {

        FileReader fileReader = null;
        String Region;
        double lat;
        double along;

        try {
            fileReader = new FileReader("co-ordinates.txt");
        } catch (FileNotFoundException e) {
            System.out.println("error opening file co-ordinates.txt");
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            while ((bufferedReader.readLine()) != null) {
                String holder[] = bufferedReader.readLine().split("-");
                Region = holder[0];
                lat = Double.parseDouble(holder[1]);
                along = Double.parseDouble(holder[2]);
                //ArrayList<String> coOrdinatesArrayList = new ArrayList<>();
                //coOrdinatesArrayList.add(Region + lat + along);
                //System.out.println(coOrdinatesArrayList);
                // System.out.println(Region + " " + lat +  " " + along);
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


    }
}



