package edu.mccneb.codeschool.weatherapi.service;

import edu.mccneb.codeschool.weatherapi.client.WeatherClient;
import edu.mccneb.codeschool.weatherapi.mapper.WeatherMapper;
import edu.mccneb.codeschool.weatherapi.model.Weather;
import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final WeatherClient weatherClient;
    private final WeatherMapper weatherMapper;

    public WeatherService(WeatherClient weatherClient, WeatherMapper weatherMapper) {
        this.weatherClient = weatherClient;
        this.weatherMapper = weatherMapper;
    }

    public ResponseEntity<WeatherDTO> getWeather(String q){
        WeatherAPI weather = weatherClient.getWeather(q);
        return ResponseEntity.ok(weatherMapper.mapWeather(weather));
    }
}
