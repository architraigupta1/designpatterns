package com.archit.designpatterns.command;

public class FanOffCommand extends FanCommand {

  public FanOffCommand(Fan fan) {
    super(fan);
  }

  @Override
  public void execute() {
    this.previousSpeed = fan.getSpeed();
    fan.off();
  }
}
