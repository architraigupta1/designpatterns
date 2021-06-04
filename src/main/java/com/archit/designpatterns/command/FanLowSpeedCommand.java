package com.archit.designpatterns.command;

public class FanLowSpeedCommand extends FanCommand {

  public FanLowSpeedCommand(Fan fan) {
    super(fan);
  }

  @Override
  public void execute() {
    this.previousSpeed = fan.getSpeed();
    fan.low();
  }
}
