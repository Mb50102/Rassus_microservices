package hr.fer.tel.rassus.humiditymicroservice.controllers;

import hr.fer.tel.rassus.humiditymicroservice.model.HumidityMeasure;
import hr.fer.tel.rassus.humiditymicroservice.services.MeasureService;
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
    public int getCurrentReading(){
        Optional<HumidityMeasure> currentReading = measureService.getReading();
        return currentReading.get().getHumidity();
    }
}
