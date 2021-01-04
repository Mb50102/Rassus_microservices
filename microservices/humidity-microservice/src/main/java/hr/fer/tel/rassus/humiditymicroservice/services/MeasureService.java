package hr.fer.tel.rassus.humiditymicroservice.services;

import hr.fer.tel.rassus.humiditymicroservice.model.HumidityMeasure;
import hr.fer.tel.rassus.humiditymicroservice.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class MeasureService {

    @Autowired
    private MeasureRepository measureRepository;

    public Optional<HumidityMeasure> getReading(){
        int hour= LocalDateTime.now().getHour();
        int minutes=LocalDateTime.now().getMinute();
        int id=4*hour+minutes/15;
        Optional<HumidityMeasure> currentReading = measureRepository.findById(id);
        return currentReading;
    }

}
