package com.archit.designpatterns.builder;

public class TestRobotBuilder {
  public static void main(String[] args) {
    RobotBuilder oldStyleBuilder = new OldStyleRobotBuilder();
    RobotEngineer robotEngineer = new RobotEngineer(oldStyleBuilder);
    robotEngineer.makeRobot();
    Robot oldRobot = robotEngineer.getRobot();

    System.out.println("Robot details: \n "
        + oldRobot.getRobotHead() + "\n"
        + oldRobot.getRobotTorso() + "\n"
        + oldRobot.getRobotArms() + "\n"
        + oldRobot.getRobotLegs());

    RobotBuilder newStyleBuilder = new NewStyleRobotBuilder();
    RobotEngineer anotherRobotEngineer = new RobotEngineer(newStyleBuilder);
    anotherRobotEngineer.makeRobot();

    Robot newRobot = anotherRobotEngineer.getRobot();

    System.out.println("Robot details: \n "
        + newRobot.getRobotHead() + "\n"
        + newRobot.getRobotTorso() + "\n"
        + newRobot.getRobotArms() + "\n"
        + newRobot.getRobotLegs());
  }



}
