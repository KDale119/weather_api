package edu.mccneb.codeschool.weatherapi.service;

import edu.mccneb.codeschool.weatherapi.client.WeatherClient;
import edu.mccneb.codeschool.weatherapi.mapper.WeatherMapper;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final WeatherClient weatherClient;
    private final WeatherMapper weatherMapper;

    public WeatherService(WeatherClient weatherClient, WeatherMapper weatherMapper) {
        this.weatherClient = weatherClient;
        this.weatherMapper = weatherMapper;
    }
}
