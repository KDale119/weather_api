package edu.mccneb.codeschool.weatherapi.service;

import edu.mccneb.codeschool.weatherapi.client.WeatherClient;
import edu.mccneb.codeschool.weatherapi.client.WeatherClient2;
import edu.mccneb.codeschool.weatherapi.mapper.WeatherMapper;
import edu.mccneb.codeschool.weatherapi.model.external.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class WeatherService {

    private final WeatherClient weatherClient;
    private final WeatherMapper weatherMapper;
    private final WeatherClient2 weatherClient2;

    public WeatherService(WeatherClient weatherClient, WeatherMapper weatherMapper, WeatherClient2 weatherClient2) {
        this.weatherClient = weatherClient;
        this.weatherMapper = weatherMapper;
        this.weatherClient2 = weatherClient2;
    }

    public ResponseEntity<WeatherDTO> getWeather(String q){
        WeatherAPI weather = weatherClient.getWeather(q);
        return ResponseEntity.ok(weatherMapper.mapWeather(weather));
    }

    public ResponseEntity<WeatherDTO> getWeatherReactive(String q){
        WeatherAPI ret = weatherClient2.getWeather(q).block();
        return ResponseEntity.ok(weatherMapper.mapWeather(ret));
    }
}
