package hr.fer.tel.rassus.aggregatorMicroservice.models;

public class Reading {
    private int humidity;
    private double temperature;
    private String temperatureUnit;

    public Reading(){

    }

    public Reading(int humidity, double temperature, String temperatureUnit) {
        this.humidity = humidity;
        this.temperature = convertTemperature(temperature, temperatureUnit);
        this.temperatureUnit = temperatureUnit;
    }


    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    private double convertTemperature(double temperature, String temperatureUnit) {
        if(temperatureUnit.equals("C")) {
            return temperature;
        }
        return temperature + 273.15;
    }
}
