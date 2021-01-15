package com.pt;

import com.pt.observer.WeatherData;
import com.pt.observer.displays.FullWeatherDisplay;
import com.pt.observer.displays.TemperatureDisplay;
import com.pt.strategy.enemies.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        runObserverExample();
    }

    private static void runStrategyExample() {
        ArrayList<Enemy> myEnemies = new ArrayList<>();
        myEnemies.add(new DragonEnemy("Thume"));
        myEnemies.add(new SkeletonEnemy("Bones"));
        myEnemies.add(new BlobEnemy("Billy"));
        myEnemies.add(new WolfEnemy("William"));

        for (Enemy enemy: myEnemies)
            enemy.performAttack();
    }

    private static void runObserverExample() {
        WeatherData weatherData = new WeatherData();

        FullWeatherDisplay fullWeatherDisplay = new FullWeatherDisplay(weatherData, "weather.com");
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData, "temp.com");


        weatherData.setMeasurements(72.4f, 12.1246f, 34.637f);
        System.out.println();
        weatherData.setMeasurements(104.899f, 19.1246f, 34.637f);
        System.out.println();
        weatherData.removeObserver(fullWeatherDisplay);
        weatherData.setMeasurements(23.4f, 56.7f, 67.9864f);

    }
}
