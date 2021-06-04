package com.archit.designpatterns.command;

public class FanMediumSpeedCommand extends FanCommand{

  public FanMediumSpeedCommand(Fan fan) {
    super(fan);
  }

  @Override
  public void execute() {
    this.previousSpeed = fan.getSpeed();
    fan.medium();
  }
}
