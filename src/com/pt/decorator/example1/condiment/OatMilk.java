package com.pt.decorator.example1.condiment;

import com.pt.decorator.example1.coffee.Beverage;

public class OatMilk extends CondimentDecorator {
    public OatMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", oat milk";
    }
}
