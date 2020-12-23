package hr.fer.tel.rassus.humiditymicroservice.repositories;

import hr.fer.tel.rassus.humiditymicroservice.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<Measure, String> {
}
