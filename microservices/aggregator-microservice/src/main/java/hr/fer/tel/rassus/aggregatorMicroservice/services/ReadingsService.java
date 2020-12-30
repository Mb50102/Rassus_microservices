package hr.fer.tel.rassus.aggregatorMicroservice.services;

import hr.fer.tel.rassus.aggregatorMicroservice.models.Humidity;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Temperature;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReadingsService {
    private final RestTemplate restTemplate;

    public ReadingsService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Humidity getHumidityReading() {
        String url = "http://localhost:8081/current-reading";
        ResponseEntity<Humidity> response = this.restTemplate.getForEntity(url, Humidity.class);
        if(response.getStatusCode()== HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }

    }

    public Temperature getTemperatureReading() {
        String url = "http://localhost:8082/current-reading";
        ResponseEntity<Temperature> response = this.restTemplate.getForEntity(url, Temperature.class);
        if(response.getStatusCode()== HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }

    }
}



