package com.pt.factory.factorymethod;

public class AstromechDroid implements Robot {
    @Override
    public void powerUp() {
        System.out.println("Astromech droid powering up.");
    }

    @Override
    public void speak() {
        System.out.println("Beep boop beep...");
    }
}
