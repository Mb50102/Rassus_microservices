package hr.fer.tel.rassus.temperaturemicroservice.repositories;

import hr.fer.tel.rassus.temperaturemicroservice.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeasureRepository extends JpaRepository<Measure, Integer> {

}
