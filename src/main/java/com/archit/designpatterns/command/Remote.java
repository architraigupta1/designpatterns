package com.archit.designpatterns.command;

public class Remote {

  Command[] onSlotCommands;
  Command[] offSlotCommands;
  Command lastCommand;

  public Remote() {
    this.onSlotCommands = new Command[7];
    this.offSlotCommands = new Command[7];
    NoCommand noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      this.onSlotCommands[i] = noCommand;
      this.offSlotCommands[i] = noCommand;
    }
    this.lastCommand = noCommand;
  }

  public void setButton(int slot, Command onCommand, Command offCommand) {
    this.onSlotCommands[slot] = onCommand;
    this.offSlotCommands[slot] = offCommand;
  }

  public void onButtonWasPressed(int slot) {
    this.onSlotCommands[slot].execute();
    this.lastCommand = this.onSlotCommands[slot];
  }

  public void offButtonWasPressed(int slot) {
    this.offSlotCommands[slot].execute();
    this.lastCommand = this.offSlotCommands[slot];
  }

  public void undoButtonWasPressed() {
    this.lastCommand.undo();
  }
}
