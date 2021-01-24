package com.pt.factory.factorymethod;

public class ProtocolDroid implements Robot {
    @Override
    public void powerUp() {
        System.out.println("Protocol droid powering up.");
    }

    @Override
    public void speak() {
        System.out.println("I am a protocol droid.");
    }
}
