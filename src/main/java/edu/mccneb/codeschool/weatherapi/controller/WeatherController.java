package edu.mccneb.codeschool.weatherapi.controller;

import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import edu.mccneb.codeschool.weatherapi.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/?q=68133")
    public ResponseEntity<WeatherDTO> getWeather(){
        return weatherService.getWeather();
    }
}


