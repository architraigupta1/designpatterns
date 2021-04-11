package com.archit.designpatterns.builder;

public class OldStyleRobotBuilder implements RobotBuilder {

  private Robot robot;

  public OldStyleRobotBuilder() {
    this.robot = new Robot();
  }

  @Override
  public void buildRobotHead() {
    robot.setRobotHead("old head");
  }

  @Override
  public void buildRobotTorso() {
    robot.setRobotTorso("old torso");
  }

  @Override
  public void buildRobotArms() {
    robot.setRobotArms("old arms");
  }

  @Override
  public void buildRobotLegs() {
    robot.setRobotLegs("old legs");
  }

  @Override
  public Robot getRobot() {
    return robot;
  }
}
