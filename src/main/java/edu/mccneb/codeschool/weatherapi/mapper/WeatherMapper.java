package edu.mccneb.codeschool.weatherapi.mapper;

import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;




@Mapper(componentModel = "spring")
public interface WeatherMapper {

//    @Mapping(target = "weather.wind.gustSpeedTimesWindSpeed", expression = "java(weather.wind.gustSpeed * weather.wind.windSpeed)")
//    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    @Mapping(target = "time.current", constant = "true")
//    @Mapping(target = "weather.tempUnit", constant = "fahrenheit")
    WeatherDTO mapWeather(WeatherAPI weather);


}