package hr.fer.tel.rassus.aggregatorMicroservice.controllers;

import hr.fer.tel.rassus.aggregatorMicroservice.models.Humidity;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Reading;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Temperature;
import hr.fer.tel.rassus.aggregatorMicroservice.services.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ReadingsController {

    @Autowired
    private ReadingsService readingsService;

    @Value("${tunit}")
    private String temperatureUnit;

    @Value("${hunit}")
    private String humidityUnit;

    @GetMapping("/readings")
    public Reading getCurrentReadings(){
        Humidity humidityReading = readingsService.getHumidityReading();
        Temperature temperatureReading= readingsService.getTemperatureReading();
        Reading reading=new Reading(humidityReading.getHumidity(),temperatureReading.getTemperature());
        return  reading;
    }

    @GetMapping("/readings-test")
    public String getTest(){
        Humidity humidityReading = readingsService.getHumidityReading();
        Temperature temperatureReading= readingsService.getTemperatureReading();
        //Reading reading=new Reading(humidityReading.getHumidity(),temperatureReading.getTemperature());
        return  "Humidity: " + humidityReading.getHumidity() + "\nTemperature: " + temperatureReading.getTemperature() + temperatureUnit;
    }
}
