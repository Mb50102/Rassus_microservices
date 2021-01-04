package hr.fer.tel.rassus.humiditymicroservice.repositories;

import hr.fer.tel.rassus.humiditymicroservice.model.HumidityMeasure;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MeasureRepository extends JpaRepository<HumidityMeasure, Integer> {

}
