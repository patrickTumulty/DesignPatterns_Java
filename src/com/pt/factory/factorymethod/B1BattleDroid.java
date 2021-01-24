package com.pt.factory.factorymethod;

public class B1BattleDroid implements Robot {
    @Override
    public void powerUp() {
        System.out.println("B1-Battle droid powering up.");
    }

    @Override
    public void speak() {
        System.out.println("Roger Roger.");
    }
}
