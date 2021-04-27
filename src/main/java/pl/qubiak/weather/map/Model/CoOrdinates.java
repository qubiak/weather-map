package pl.qubiak.weather.map.Model;

public class CoOrdinates {

    private String region;
    private double lat;
    private double lon;


    public CoOrdinates() {
    }

    public CoOrdinates(String region, double lat, double lon) {
        this.region = region;
        this.lat = lat;
        this.lon = lon;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}