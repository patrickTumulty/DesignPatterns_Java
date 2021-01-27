package com.pt.command.commands;

import com.pt.command.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
