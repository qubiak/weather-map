package pl.qubiak.weather.map.Model;

public class CoOrdinates {

    private String region;
    private String lat;
    private String aLong;

    public CoOrdinates() {
    }

    public CoOrdinates(String region, String lat, String aLong) {
        region = region;
        lat = lat;
        this.aLong = aLong;
    }

    public CoOrdinates(String region) {
        region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        region = region;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        lat = lat;
    }

    public String getLong() {
        return aLong;
    }

    public void setLong(String aLong) {
        aLong = aLong;
    }
}
