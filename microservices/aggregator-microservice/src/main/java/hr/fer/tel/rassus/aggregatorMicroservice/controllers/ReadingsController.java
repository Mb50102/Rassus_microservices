package hr.fer.tel.rassus.aggregatorMicroservice.controllers;

import hr.fer.tel.rassus.aggregatorMicroservice.models.Humidity;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Reading;
import hr.fer.tel.rassus.aggregatorMicroservice.models.Temperature;
import hr.fer.tel.rassus.aggregatorMicroservice.services.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReadingsController {

    @Autowired
    private ReadingsService readingsService;

    @GetMapping("/readings")
    public Reading getCurrentReadings(){
        Humidity humidityReading = readingsService.getHumidityReading();

        Temperature temperatureReading= readingsService.getTemperatureReading();

        Reading reading=new Reading(humidityReading.getHumidity(),temperatureReading.getTemperature());

        return  reading;
    }
}
