package hr.fer.tel.rassus.aggregatorMicroservice.models;

import java.io.Serializable;

public class Humidity implements Serializable {
    private int humidity;

    public Humidity(){

    }

    public Humidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


}

