package edu.mccneb.codeschool.weatherapi.model;

public class Wind {
    Double windSpeed;
    String windSpeedUnit;
    String windDirection;
    Double gustSpeed;
    Double gustSpeedTimesWindSpeed;

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindSpeedUnit() {
        return windSpeedUnit;
    }

    public void setWindSpeedUnit(String windSpeedUnit) {
        this.windSpeedUnit = windSpeedUnit;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Double getGustSpeed() {
        return gustSpeed;
    }

    public void setGustSpeed(Double gustSpeed) {
        this.gustSpeed = gustSpeed;
    }

    public Double getGustSpeedTimesWindSpeed() {
        return gustSpeedTimesWindSpeed;
    }

    public void setGustSpeedTimesWindSpeed(Double gustSpeedTimesWindSpeed) {
        this.gustSpeedTimesWindSpeed = gustSpeedTimesWindSpeed;
    }
}
