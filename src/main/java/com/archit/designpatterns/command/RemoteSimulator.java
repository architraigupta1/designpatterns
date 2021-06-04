package com.archit.designpatterns.command;

public class RemoteSimulator {
  public static void main(String[] args) {
    Remote remote = new Remote();

    //Create devices
    Light bedroomLight = new Light("Bedroom");
    Light kitchenLight = new Light("Kitchen");
    Light livingRoomLight = new Light("Living Room");
    Fan bedroomFan = new Fan("Bedroom");
    Fan livingRoomFan = new Fan("Living Room");
    Stereo stereo = new Stereo();

    //Create macro command
    Command[] onCommands = { new LightOnCommand(livingRoomLight), new StereoOnCommand(stereo) };
    MacroCommand partyModeOn = new MacroCommand(onCommands);

    Command[] offCommands = { new LightOffCommand(livingRoomLight), new StereoOffCommand(stereo) };
    MacroCommand partyModeOff = new MacroCommand(offCommands);

    //set remote slots
    remote.setButton(0, new LightOnCommand(bedroomLight), new LightOffCommand(bedroomLight));
    remote.setButton(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
    remote.setButton(2, new FanHighSpeedCommand(bedroomFan), new FanOffCommand(bedroomFan));
    remote.setButton(3, new FanMediumSpeedCommand(livingRoomFan), new FanOffCommand(livingRoomFan));
    remote.setButton(4, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
    remote.setButton(5, partyModeOn, partyModeOff);

    //perform commands
    //party mode test
    remote.onButtonWasPressed(5);
    remote.offButtonWasPressed(5);
    remote.undoButtonWasPressed();

    //regular commands test
    remote.onButtonWasPressed(0); //Bedroom Light on
    remote.onButtonWasPressed(1); //Kitchen Light on
    remote.undoButtonWasPressed();    //Kitchen Light off
    remote.offButtonWasPressed(0); //Bedroom Light off
    remote.onButtonWasPressed(2);//Bedroom Fan speed high
    remote.offButtonWasPressed(2);//Bedroom Fan off
    remote.undoButtonWasPressed();    //Bedroom Fan speed high
    remote.onButtonWasPressed(4);
    remote.undoButtonWasPressed();

  }

}
