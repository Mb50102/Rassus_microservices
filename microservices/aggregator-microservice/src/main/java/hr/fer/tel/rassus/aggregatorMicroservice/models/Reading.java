package hr.fer.tel.rassus.aggregatorMicroservice.models;

public class Reading {
    private int humidity;
    private int temperature;

    public Reading(){

    }

    public Reading(int humidity, int temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }


    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
