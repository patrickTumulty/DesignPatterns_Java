package com.pt.command;

public class CeilingFan {
    public enum FanSpeed {
        OFF, LOW, MEDIUM, HIGH;
    }

    private FanSpeed speed;
    private final String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = FanSpeed.OFF;

    }

    public void high() {
        speed = FanSpeed.HIGH;
        System.out.println(location + " ceiling fan HIGH");
    }

    public void medium() {
        speed = FanSpeed.MEDIUM;
        System.out.println(location + " ceiling fan MEDIUM");
    }

    public void low() {
        speed = FanSpeed.LOW;
        System.out.println(location + " ceiling fan LOW");
    }

    public void off() {
        speed = FanSpeed.OFF;
        System.out.println(location + " ceiling fan OFF");
    }

    public FanSpeed getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }
}
