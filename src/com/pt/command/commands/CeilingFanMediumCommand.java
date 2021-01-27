package com.pt.command.commands;

import com.pt.command.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
}
