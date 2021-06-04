package com.archit.designpatterns.command;

public abstract class FanCommand implements Command {

  Fan fan;
  int previousSpeed;

  public FanCommand(Fan fan) {
    this.fan = fan;
  }

  public void undo() {
    if (previousSpeed == Fan.HIGH) {
      fan.high();
    } else if (previousSpeed == Fan.MEDIUM) {
      fan.medium();
    } else if (previousSpeed == Fan.LOW) {
      fan.low();
    } else {
      fan.off();
    }
  }
}
