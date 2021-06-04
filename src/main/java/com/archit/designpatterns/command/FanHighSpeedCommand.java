package com.archit.designpatterns.command;

public class FanHighSpeedCommand extends FanCommand {

  public FanHighSpeedCommand(Fan fan) {
    super(fan);
  }

  @Override
  public void execute() {
    this.previousSpeed = fan.getSpeed();
    fan.high();
  }
}
