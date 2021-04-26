package pl.qubiak.weather.map.Model;

public class Poit {

    private String lat;
    private String along;
    private String stationId;
    private String stationName;
    private String dateOfMeasurement;
    private String timeOfMeasurement;
    private String temperature;
    private String windSpeed;
    private String windDirection;
    private String relativeHumidity;
    private String rainfall;
    private String pressure;


    public Poit() {
    }

    public Poit(String lat, String along, String stationId, String stationName, String dateOfMeasurement, String timeOfMeasurement, String temperature, String windSpeed, String windDirection, String relativeHumidity, String rainfall, String pressure) {
        this.lat = lat;
        this.along = along;
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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAlong() {
        return along;
    }

    public void setAlong(String along) {
        this.along = along;
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

