package com.pt.decorator.example1.condiment;

import com.pt.decorator.example1.coffee.Beverage;

public class SteamedFoam extends CondimentDecorator {
    public SteamedFoam(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamed foam";
    }
}
