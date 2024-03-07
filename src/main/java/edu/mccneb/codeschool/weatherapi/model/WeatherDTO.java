package edu.mccneb.codeschool.weatherapi.model;

import java.util.UUID;

public class WeatherDTO {
    private String id;
    private UUID newId;
    private String name;
    private String region;
    private String country;
    private Double latitude;
    private Time time;
    private Weather weather;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UUID getNewId() {
        return newId;
    }

    public void setNewId(UUID newId) {
        this.newId = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
