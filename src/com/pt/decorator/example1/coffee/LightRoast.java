package com.pt.decorator.example1.coffee;

public class LightRoast extends Beverage {

    public LightRoast() {
        description = "Light Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
