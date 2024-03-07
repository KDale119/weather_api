package edu.mccneb.codeschool.weatherapi.mapper;

import edu.mccneb.codeschool.weatherapi.model.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface WeatherMapper {

    @Mapping(target = "newId", expression = "java(java.util.UUID.randomUUID())")
    WeatherDTO mapWeather(WeatherAPI weather);
}
