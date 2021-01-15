package com.pt;

import com.pt.decorator.example1.coffee.Beverage;
import com.pt.decorator.example1.coffee.DarkRoast;
import com.pt.decorator.example1.coffee.Decaf;
import com.pt.decorator.example1.coffee.Espresso;
import com.pt.decorator.example1.condiment.*;
import com.pt.decorator.example2.LowerCaseInputStream;
import com.pt.observer.WeatherData;
import com.pt.observer.displays.FullWeatherDisplay;
import com.pt.observer.displays.TemperatureDisplay;
import com.pt.strategy.enemies.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        runDecoratorExample2();
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

    private static void runDecoratorExample1() {
        Beverage espresso = new Espresso();
        espresso = new SteamedFoam(espresso);

        espresso.printBeverage();

        Beverage darkroast = new DarkRoast();
        darkroast = new OatMilk(darkroast);
        darkroast = new Mocha(darkroast);
        darkroast = new Whip(darkroast);

        darkroast.printBeverage();

        Beverage decaf = new Decaf();
        decaf = new SoyMilk(decaf);
        decaf = new SteamedFoam(decaf);

        decaf.printBeverage();

    }

    public static void runDecoratorExample2() {
        int c;

        try {
            InputStream in = new FileInputStream("test.txt");
            in = new BufferedInputStream(in);
            in = new LowerCaseInputStream(in);

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
