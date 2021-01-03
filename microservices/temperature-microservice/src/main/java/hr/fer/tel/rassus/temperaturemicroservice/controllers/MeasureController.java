package hr.fer.tel.rassus.temperaturemicroservice.controllers;

import hr.fer.tel.rassus.temperaturemicroservice.model.Measure;
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

    @Value("${unit}")
    private String unit;

    @GetMapping("/current-reading")
    public int getCurrentReading(){
        Optional<Measure> currentReading = measureService.getReading();
        return currentReading.get().getTemperature();
    }

    @GetMapping("/current-reading-test")
    public String getCurrent() {
        Optional<Measure> currentReading = measureService.getReading();
        return currentReading.get().getTemperature() + unit;
    }

}
