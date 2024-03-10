package edu.mccneb.codeschool.weatherapi.client;

import edu.mccneb.codeschool.weatherapi.config.WeatherConfig;
import edu.mccneb.codeschool.weatherapi.model.external.WeatherAPI;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

@Component
public class WeatherClient2 {
    private final WeatherConfig weatherConfig;
    private final WebClient webClient;

    public WeatherClient2(WeatherConfig weatherConfig, WebClient.Builder webClientBuilder) {
        this.weatherConfig = weatherConfig;
        this.webClient = webClientBuilder
                .baseUrl(weatherConfig.getHost())
                .defaultHeaders(httpHeaders())
                .build();
    }
    public Consumer<HttpHeaders> httpHeaders(){
        return headers -> {
            headers.set("Accept", String.valueOf(MediaType.APPLICATION_JSON));
            headers.set("X-RapidAPI-Key", weatherConfig.getApiKey());
            headers.set("X-RapidAPI-Host", weatherConfig.getApiHost());
        };
    }
    public Mono<WeatherAPI> getWeather(String q){
        return webClient.get().uri(uriBuilder -> uriBuilder
                        .path(weatherConfig.getPath())
                        .queryParam("q")
                        .build(q))
                .retrieve()
                .bodyToMono(WeatherAPI.class);
    }

}
