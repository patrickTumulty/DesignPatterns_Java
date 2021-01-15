package com.pt.observer.displays;

import com.pt.observer.WeatherData;
import com.pt.observer.displays.WeatherDisplay;

public class TemperatureDisplay extends WeatherDisplay {

    public TemperatureDisplay(WeatherData weatherData, String name) {
        super(weatherData, name);
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        System.out.printf("[%s]\n", name);
        System.out.printf("Temp : [%6.2f]\n", weatherData.getTemperature());
    }
}
