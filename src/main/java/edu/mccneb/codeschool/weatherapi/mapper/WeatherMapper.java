package edu.mccneb.codeschool.weatherapi.mapper;

import edu.mccneb.codeschool.weatherapi.model.external.WeatherAPI;
import edu.mccneb.codeschool.weatherapi.model.WeatherDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;




@Mapper(componentModel = "spring")
public interface WeatherMapper {

    @Mapping(source = "location.name", target = "name")
    @Mapping(source = "location.region", target = "region")
    @Mapping(source = "location.country", target = "country")
    @Mapping(source = "location.lat", target = "latitude")
    @Mapping(source = "location.lon", target = "longitude")

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    @Mapping(source = "location.localtime", target = "time.lastUpdatedDateTime")
    @Mapping(target = "time.current", constant = "true")
    @Mapping(source = "current.tempF", target = "weather.temp")
    @Mapping(source = "current.feelslikeF", target = "weather.feelsLikeTemp") // not working
    @Mapping(target = "weather.tempUnit", constant = "fahrenheit")
    @Mapping(source = "current.humidity", target = "weather.humidity")

    @Mapping(source = "current.windMph", target = "wind.windSpeed")
    @Mapping(target = "wind.windSpeedUnit", constant = "mph")
    @Mapping(source = "current.windDir", target = "wind.windDirection")
    @Mapping(source = "current.gustMph", target = "wind.gustSpeed")
    @Mapping(target = "wind.gustSpeedTimesWindSpeed", expression = "java(current.getWindMph() * current.getGustMph())")

    WeatherDTO mapWeather(WeatherAPI weather);


}