package edu.mccneb.codeschool.weatherapi.controller;

import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import edu.mccneb.codeschool.weatherapi.service.WeatherService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Controller
@RequestMapping("/api/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/zipCode")
    public ResponseEntity<WeatherDTO> getWeather(@RequestParam String q){
        return weatherService.getWeather(q);
    }
}


