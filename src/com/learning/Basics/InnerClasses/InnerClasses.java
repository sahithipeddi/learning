package com.learning.Basics.InnerClasses;

public class InnerClasses {

    public static void main(String[] args) {

        Robot robot1 = new Robot(7);

        robot1.start();

        Robot.Brain brain = robot1.new Brain();

        brain.thinks();

//T0 group with other classes..
        Robot.Battery battery = new Robot.Battery();

        battery.charge();

    }
}
