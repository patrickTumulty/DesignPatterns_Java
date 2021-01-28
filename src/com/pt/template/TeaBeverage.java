package com.pt.template;

public class TeaBeverage extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping tea bag...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding honey.");
    }

    @Override
    public boolean customerWantsCondiments() {
        // Here we have override this hook method to always be false. No condiments
        return false;
    }
}
