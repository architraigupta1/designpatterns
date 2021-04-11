package com.archit.designpatterns.builder;

public class NewStyleRobotBuilder implements RobotBuilder {

  private Robot robot;

  public NewStyleRobotBuilder() {
    this.robot = new Robot();
  }

  @Override
  public void buildRobotHead() {
    robot.setRobotHead("new head");
  }

  @Override
  public void buildRobotTorso() {
    robot.setRobotTorso("new torso");
  }

  @Override
  public void buildRobotArms() {
    robot.setRobotArms("new arms");
  }

  @Override
  public void buildRobotLegs() {
    robot.setRobotLegs("new legs");
  }

  @Override
  public Robot getRobot() {
    return robot;
  }
}
