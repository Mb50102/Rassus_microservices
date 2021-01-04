package hr.fer.tel.rassus.temperaturemicroservice.controllers;

import hr.fer.tel.rassus.temperaturemicroservice.model.TemperatureMeasure;
import hr.fer.tel.rassus.temperaturemicroservice.services.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MeasureController {

    @Autowired
    private MeasureService measureService;

    @GetMapping("/current-reading")
    public double getCurrentReading(){
        Optional<TemperatureMeasure> currentReading = measureService.getReading();
        return currentReading.get().getTemperature();
    }
}
