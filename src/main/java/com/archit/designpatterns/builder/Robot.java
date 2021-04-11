package com.archit.designpatterns.builder;

public class Robot implements RobotPlan {

  private String head;
  private String torso;
  private String arms;
  private String legs;

  @Override
  public void setRobotHead(String head) {
    this.head = head;
  }

  @Override
  public void setRobotTorso(String torso) {
    this.torso = torso;
  }

  @Override
  public void setRobotArms(String arms) {
    this.arms = arms;
  }

  @Override
  public void setRobotLegs(String legs) {
    this.legs = legs;
  }

  public String getRobotHead() {
    return head;
  }

  public String getRobotTorso() {
    return torso;
  }

  public String getRobotArms() {
    return arms;
  }

  public String getRobotLegs() {
    return legs;
  }
}
