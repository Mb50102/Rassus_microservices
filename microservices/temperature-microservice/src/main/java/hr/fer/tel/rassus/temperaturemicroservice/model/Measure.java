package hr.fer.tel.rassus.temperaturemicroservice.model;

import javax.persistence.*;

@Entity
@Table(name="measures")
public class Measure{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  Id;

    private int temperature;

    private int pressure;

    private int humidity;

    private int co;

    private int no2;

    private int so2;


    public Measure() {
    }

    public Measure(int temperature,int pressure,int humidity,int co, int no2,int so2){
        this.co=co;
        this.humidity=humidity;
        this.no2=no2;
        this.pressure=pressure;
        this.temperature=temperature;
        this.so2=so2;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    @Override
    public String toString() {
        return "Measure{" +
                "Id=" + Id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", co=" + co +
                ", no2=" + no2 +
                ", so2=" + so2 +
                '}';
    }
}
