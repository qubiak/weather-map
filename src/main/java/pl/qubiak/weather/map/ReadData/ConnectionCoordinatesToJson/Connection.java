package pl.qubiak.weather.map.ReadData.ConnectionCoordinatesToJson;

import pl.qubiak.weather.map.Model.CoOrdinates;
import pl.qubiak.weather.map.Model.Poit;

public class Connection {

    private Poit poit;
    private CoOrdinates coOrdinates;

    public void ConnectionData() {

        if (poit.getStationName().equals(coOrdinates.getRegion())) {
            poit.setLat(coOrdinates.getLat());
            poit.setAlong(coOrdinates.getLong());
        }
    }
}
