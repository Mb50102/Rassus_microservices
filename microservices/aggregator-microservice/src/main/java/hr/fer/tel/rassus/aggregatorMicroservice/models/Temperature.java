package hr.fer.tel.rassus.aggregatorMicroservice.models;

import java.io.Serializable;

public class Temperature implements Serializable {
    private int temperature;

    public Temperature(){

    }

    public Temperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}

