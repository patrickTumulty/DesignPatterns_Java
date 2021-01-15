package com.pt.decorator.example1.coffee;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 3.25;
    }
}
