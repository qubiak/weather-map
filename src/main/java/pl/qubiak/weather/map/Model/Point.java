package pl.qubiak.weather.map.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Point {

    private double lat;
    private double lon;
    @SerializedName(value = "id_stacji")
    private String stationId;
    @SerializedName(value = "stacja")
    private String stationName;
    @SerializedName(value = "data_pomiaru")
    private String dateOfMeasurement;
    @SerializedName(value = "godzina_pomiaru")
    private String timeOfMeasurement;
    @SerializedName(value = "temperatura")
    private String temperature;
    @SerializedName(value = "predkosc_wiatru")
    private String windSpeed;
    @SerializedName(value = "kierunek_wiatru")
    private String windDirection;
    @SerializedName(value = "wilgotnosc_wzgledna")
    private String relativeHumidity;
    @SerializedName(value = "suma_opadu")
    private String rainfall;
    @SerializedName(value = "cisnienie")
    private String pressure;


    public Point() {
    }

    public Point(double lat, double lon, String stationId, String stationName, String dateOfMeasurement, String timeOfMeasurement, String temperature, String windSpeed, String windDirection, String relativeHumidity, String rainfall, String pressure) {
        this.lat = lat;
        this.lon = lon;
        this.stationId = stationId;
        this.stationName = stationName;
        this.dateOfMeasurement = dateOfMeasurement;
        this.timeOfMeasurement = timeOfMeasurement;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.relativeHumidity = relativeHumidity;
        this.rainfall = rainfall;
        this.pressure = pressure;
    }

    public Point(double lat, double lon, ArrayList<Point> weatherArray) {
    }

    public double getLat() {
        return lat;
    }

    public double setLat(double lat) {
        this.lat = lat;
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public double setLon(double lon) {
        this.lon = lon;
        return lon;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDateOfMeasurement() {
        return dateOfMeasurement;
    }

    public void setDateOfMeasurement(String dateOfMeasurement) {
        this.dateOfMeasurement = dateOfMeasurement;
    }

    public String getTimeOfMeasurement() {
        return timeOfMeasurement;
    }

    public void setTimeOfMeasurement(String timeOfMeasurement) {
        this.timeOfMeasurement = timeOfMeasurement;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}

