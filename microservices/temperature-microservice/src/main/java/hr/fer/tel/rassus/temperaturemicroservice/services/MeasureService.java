package hr.fer.tel.rassus.temperaturemicroservice.services;

import hr.fer.tel.rassus.temperaturemicroservice.model.Measure;
import hr.fer.tel.rassus.temperaturemicroservice.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class MeasureService {

    @Autowired
    private MeasureRepository measureRepository;

    public Optional<Measure> getReading(){
        int hour= LocalDateTime.now().getHour();
        int minutes=LocalDateTime.now().getMinute();
        int id=4*hour+minutes/15;
        Optional<Measure> currentReading = measureRepository.findById(id);
        return currentReading;
    }

}
