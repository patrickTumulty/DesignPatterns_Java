package com.pt.decorator.example1.condiment;

import com.pt.decorator.example1.coffee.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip cream";
    }
}
