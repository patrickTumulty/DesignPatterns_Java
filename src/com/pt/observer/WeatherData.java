package com.pt.observer;

import com.pt.observer.displays.Observer;
import com.pt.observer.displays.WeatherDisplay;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observerList;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList)
            observer.update();
    }
}
