package hr.fer.tel.rassus.temperaturemicroservice.repositories;

import hr.fer.tel.rassus.temperaturemicroservice.model.TemperatureMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<TemperatureMeasure, Integer> {

}
