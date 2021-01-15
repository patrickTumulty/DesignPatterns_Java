package com.pt.observer.displays;

import com.pt.observer.WeatherData;

public class FullWeatherDisplay extends WeatherDisplay {

    public FullWeatherDisplay(WeatherData weatherData, String name) {
        super(weatherData, name);
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        System.out.printf("[%12s]\n", name);
        System.out.printf("Temperature : %6.2f\n", weatherData.getTemperature());
        System.out.printf("Pressure    : %6.2f\n", weatherData.getPressure());
        System.out.printf("Humidity    : %6.2f\n", weatherData.getHumidity());
    }
}
