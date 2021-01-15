package com.pt.observer.displays;

import com.pt.observer.WeatherData;
import com.pt.observer.displays.Observer;

public abstract class WeatherDisplay implements Observer {
    protected String name;
    protected WeatherData weatherData;

    public WeatherDisplay(WeatherData weatherData, String name) {
        this.name = name;
        this.weatherData = weatherData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
