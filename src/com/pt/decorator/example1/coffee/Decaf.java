package com.pt.decorator.example1.coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 2.75;
    }
}
