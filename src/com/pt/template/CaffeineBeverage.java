package com.pt.template;

public abstract class CaffeineBeverage {

    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pour into cup.");
    }

    public boolean customerWantsCondiments() {
        /*
        This method is considered the HOOK. It is an optional override
        that controls an optional step in the algorithm.
         */
        return true;
    }
}
