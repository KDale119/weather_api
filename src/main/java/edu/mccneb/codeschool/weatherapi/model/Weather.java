package edu.mccneb.codeschool.weatherapi.model;

public class Weather {
    Double temp;
    Double feelsLikeTemp;
    String tempUnit;
    Integer humidity;


    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLikeTemp() {
        return feelsLikeTemp;
    }

    public void setFeelsLikeTemp(Double feelsLikeTemp) {
        this.feelsLikeTemp = feelsLikeTemp;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

}
