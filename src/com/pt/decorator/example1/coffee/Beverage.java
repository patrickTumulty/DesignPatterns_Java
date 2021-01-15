package com.pt.decorator.example1.coffee;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void printBeverage() {
        System.out.printf("Order: %s - [$%5.2f]\n", getDescription(), cost());
    }

}
