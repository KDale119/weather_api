package edu.mccneb.codeschool.weatherapi.client;

import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {
    private final RestTemplate restTemplate;

    public WeatherClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherAPI getWeatherBy(){
        return restTemplate.getForObject("https://weatherapi-com.p.rapidapi.com/forecast.json?q=68133", WeatherAPI.class);

    }
}

