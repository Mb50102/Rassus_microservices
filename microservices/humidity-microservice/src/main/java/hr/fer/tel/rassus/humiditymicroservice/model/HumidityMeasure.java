package hr.fer.tel.rassus.humiditymicroservice.model;

import javax.persistence.*;

@Entity
@Table(name="humidityMeasures")
public class HumidityMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  Id;

    private int humidity;

    public HumidityMeasure() {
    }

    public HumidityMeasure( int humidity){
        this.humidity=humidity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;

    }



    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    @Override
    public String toString() {
        return "Measure{" +
                "Id=" + Id +
                ", humidity=" + humidity +
                '}';
    }
}
