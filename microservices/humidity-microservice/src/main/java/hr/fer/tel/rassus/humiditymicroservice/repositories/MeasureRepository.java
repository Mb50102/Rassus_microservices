package hr.fer.tel.rassus.humiditymicroservice.repositories;

import hr.fer.tel.rassus.humiditymicroservice.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeasureRepository extends JpaRepository<Measure, Integer> {

    @Query("SELECT measure FROM  Measure measure WHERE  measure.Id=50")
    Measure findbymarko();
}
