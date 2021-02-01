package com.pt;

import com.pt.adapter.duckturkey.*;
import com.pt.command.CeilingFan;
import com.pt.command.GarageDoor;
import com.pt.command.Light;
import com.pt.command.RemoteControl;
import com.pt.command.commands.*;
import com.pt.decorator.example1.coffee.Beverage;
import com.pt.decorator.example1.coffee.DarkRoast;
import com.pt.decorator.example1.coffee.Decaf;
import com.pt.decorator.example1.coffee.Espresso;
import com.pt.decorator.example1.condiment.*;
import com.pt.decorator.example2.LowerCaseInputStream;
import com.pt.factory.factorymethod.Robot;
import com.pt.factory.factorymethod.StarWarRobots;
import com.pt.factory.factorymethod.StarWarsRobotFactory;
import com.pt.iterator.DinerMenu;
import com.pt.iterator.PancakeHouseMenu;
import com.pt.iterator.Waitress;
import com.pt.observer.WeatherData;
import com.pt.observer.displays.FullWeatherDisplay;
import com.pt.observer.displays.TemperatureDisplay;
import com.pt.strategy.enemies.*;
import com.pt.template.CaffeineBeverage;
import com.pt.template.CoffeeBeverage;
import com.pt.template.TeaBeverage;
import com.pt.template.sorting.SortingExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        runIteratorExample();
//        runTemplateSortingExample();
//        runTemplateExample();
//        runAdapterExample();
//        runCommandExample();
//        runFactoryMethodExample();
//        runObserverExample();
//        runStrategyExample();
//        runDecoratorExample1();
//        runDecoratorExample2();
    }

    private static void runIteratorExample() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

    private static void runTemplateSortingExample() {
        // See com.pt.template.sorting for implementation details
        SortingExample example = new SortingExample();
        example.runExample();
    }

    private static void runTemplateExample() {
        CaffeineBeverage tea = new TeaBeverage();
        CaffeineBeverage coffee = new CoffeeBeverage();

        System.out.println("\nPreparing tea...");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee...");
        coffee.prepareRecipe();
    }

    private static void runAdapterExample() {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        AdapterTest.testDuck(duck);
        System.out.println("\nThe turkey adapter says...");
        AdapterTest.testDuck(turkeyAdapter);
    }

    private static void runCommandExample() {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remoteControl.setCommand(1, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));
        remoteControl.setCommand(2, new CeilingFanHighCommand(ceilingFan));
        remoteControl.setCommand(3, new CeilingFanMediumCommand(ceilingFan));
        remoteControl.setCommand(4, new CeilingFanLowCommand(ceilingFan));
        remoteControl.setCommand(5, new CeilingFanOffCommand(ceilingFan));

        System.out.println(remoteControl + "\n");
        remoteControl.onButtonPushed(0);
        remoteControl.onButtonPushed(2);
        remoteControl.onButtonPushed(4);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(0);
        System.out.println("---- UNDOING ----");
        remoteControl.undoButtonPushed();
        remoteControl.undoButtonPushed();
        remoteControl.undoButtonPushed();
        remoteControl.undoButtonPushed();
        remoteControl.undoButtonPushed();
        remoteControl.undoButtonPushed();


    }

    private static void runFactoryMethodExample() {
        StarWarsRobotFactory robotFactory = new StarWarsRobotFactory();

        Robot protocol = robotFactory.getRobot(StarWarRobots.PROTOCOL_DROID);
        Robot astromech = robotFactory.getRobot(StarWarRobots.ASTROMECH_DROID);
        Robot gonk = robotFactory.getRobot(StarWarRobots.GONK_DROID);
        Robot b1Battle = robotFactory.getRobot(StarWarRobots.B1_BATTLE_DROID);

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
