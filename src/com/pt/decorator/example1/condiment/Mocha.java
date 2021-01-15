package com.pt.decorator.example1.condiment;

import com.pt.decorator.example1.coffee.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
}
