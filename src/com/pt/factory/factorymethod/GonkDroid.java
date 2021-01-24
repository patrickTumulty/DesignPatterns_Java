package com.pt.factory.factorymethod;

public class GonkDroid implements Robot {
    @Override
    public void powerUp() {
        System.out.println("Gonk droid powering up.");
    }

    @Override
    public void speak() {
        System.out.println("GOOONK!");
    }
}
