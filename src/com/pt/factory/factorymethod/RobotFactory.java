package com.pt.factory.factorymethod;

public abstract class RobotFactory {

    public Robot getRobot(RobotType type) {
        Robot robot = createRobot(type);
        if (robot == null) {
            return null;
        }

        robot.powerUp();
        robot.speak();

        return robot;
    }


    protected abstract Robot createRobot(RobotType type);

}
