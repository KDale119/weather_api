package edu.mccneb.codeschool.weatherapi.controller;

import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import edu.mccneb.codeschool.weatherapi.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
//@RequestMapping("/api/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/api/v1/weather/zipCode")
    public ResponseEntity<WeatherDTO> getWeather(@RequestParam String q){
        return weatherService.getWeather(q);
    }

    @GetMapping("/api/v2/weather/zipCode")
    public ResponseEntity<WeatherDTO> getWeatherV2(@RequestParam String q){
        return weatherService.getWeatherReactive(q);
    }
}


