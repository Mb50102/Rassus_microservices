package hr.fer.tel.rassus.aggregatorMicroservice.models;

import java.io.Serializable;

public class Temperature implements Serializable {
    private double temperature;

    public Temperature(){

    }

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}

