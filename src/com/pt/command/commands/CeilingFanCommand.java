package com.pt.command.commands;

import com.pt.command.CeilingFan;

public abstract class CeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;
    protected CeilingFan.FanSpeed prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public abstract void execute();

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.FanSpeed.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.FanSpeed.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.FanSpeed.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.FanSpeed.OFF) {
            ceilingFan.off();
        }
    }
}
