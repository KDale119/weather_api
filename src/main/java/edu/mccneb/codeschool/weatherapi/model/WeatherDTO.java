package edu.mccneb.codeschool.weatherapi.model;

import java.util.UUID;

public class WeatherDTO {
    private UUID id;
    private String name;
    private String region;
    private String country;
    private Double latitude;
    private Time time;
    private Weather weather;

    public UUID getId() {
        return id;
    }

    public WeatherDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WeatherDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public WeatherDTO setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public WeatherDTO setCountry(String country) {
        this.country = country;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public WeatherDTO setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Time getTime() {
        return time;
    }

    public WeatherDTO setTime(Time time) {
        this.time = time;
        return this;
    }

    public Weather getWeather() {
        return weather;
    }

    public WeatherDTO setWeather(Weather weather) {
        this.weather = weather;
        return this;
    }
}
