package com.pt.decorator.example1.condiment;

import com.pt.decorator.example1.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
