package edu.mccneb.codeschool.weatherapi.client;

import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class WeatherClient {
    private final RestTemplate restTemplate;

    public WeatherClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherAPI getWeather(String q){
        return restTemplate.getForObject("https://weatherapi-com.p.rapidapi.com/current.json?q=53.1%2C-0.13", WeatherAPI.class, q);
    }

}

