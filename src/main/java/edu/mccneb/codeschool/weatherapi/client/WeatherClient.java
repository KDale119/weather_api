package edu.mccneb.codeschool.weatherapi.client;

import edu.mccneb.codeschool.weatherapi.model.external.WeatherAPI;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    private final RestTemplate restTemplate;

    public WeatherClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherAPI getWeather(String q){
        return restTemplate.getForObject("https://weatherapi-com.p.rapidapi.com/current.json?q={q}", WeatherAPI.class, q);
    }

}

