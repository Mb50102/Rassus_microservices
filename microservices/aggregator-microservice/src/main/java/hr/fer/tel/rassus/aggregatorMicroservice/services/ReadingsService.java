package hr.fer.tel.rassus.aggregatorMicroservice.services;

import hr.fer.tel.rassus.aggregatorMicroservice.models.Humidity;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReadingsService {
    @Autowired
    private RestTemplate restTemplate;

    public Humidity getHumidityReading() {
        String url = "http://humidity-ms/current-reading";
        ResponseEntity<Humidity> response = this.restTemplate.getForEntity(url, Humidity.class);
        if(response.getStatusCode()== HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }

    }

    public Temperature getTemperatureReading() {
        String url = "http://temperature-ms/current-reading";
        ResponseEntity<Temperature> response = this.restTemplate.getForEntity(url, Temperature.class);
        if(response.getStatusCode()== HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }

    }
}



