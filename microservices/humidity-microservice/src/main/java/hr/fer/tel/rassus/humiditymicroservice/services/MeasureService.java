package hr.fer.tel.rassus.humiditymicroservice.services;

import hr.fer.tel.rassus.humiditymicroservice.model.Measure;
import hr.fer.tel.rassus.humiditymicroservice.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
