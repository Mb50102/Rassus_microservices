package hr.fer.tel.rassus.temperaturemicroservice.model;

import javax.persistence.*;

@Entity
@Table(name="temperatureMeasures")
public class TemperatureMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  Id;

    private double temperature;



    public TemperatureMeasure() {
    }

    public TemperatureMeasure(double temperature){
        this.temperature=temperature;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }



    @Override
    public String toString() {
        return "Measure{" +
                "Id=" + Id +
                ", temperature=" + temperature +
                '}';
    }
}
