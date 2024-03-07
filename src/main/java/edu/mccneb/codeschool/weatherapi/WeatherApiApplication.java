package edu.mccneb.codeschool.weatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return new RestTemplateBuilder().interceptors(
				(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) -> {
					request.getHeaders().set("X-RapidAPI-Key", "19363a26e4msh749e8cb1644bb94p11aba1jsn25391c4eb876");
					request.getHeaders().set("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com");
					return execution.execute(request, body);
				}
		).build();
	}

}
