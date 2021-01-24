package com.pt.factory.factorymethod;

public class StarWarsRobotFactory extends RobotFactory {

    @Override
    protected Robot createRobot(RobotType type) {
        if (StarWarRobots.PROTOCOL_DROID.equals(type)) {
            return new ProtocolDroid();
        } else if (StarWarRobots.ASTROMECH_DROID.equals(type)) {
            return new AstromechDroid();
        } else if (StarWarRobots.GONK_DROID.equals(type)) {
            return new GonkDroid();
        } else if (StarWarRobots.B1_BATTLE_DROID.equals(type)) {
            return new B1BattleDroid();
        }
        return null;
    }
}
