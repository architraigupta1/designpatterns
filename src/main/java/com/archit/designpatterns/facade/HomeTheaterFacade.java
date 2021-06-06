package com.archit.designpatterns.facade;

public class HomeTheaterFacade {

  PopcornPopper popcornPopper;
  TheaterLights lights;
  Amplifier amplifier;
  DvdPlayer dvdPlayer;
  Projector projector;

  public HomeTheaterFacade(PopcornPopper popcornPopper,
      TheaterLights lights,
      Amplifier amplifier,
      DvdPlayer dvdPlayer,
      Projector projector) {
    this.popcornPopper = popcornPopper;
    this.lights = lights;
    this.amplifier = amplifier;
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
  }

  public void watchMovie() {
    popcornPopper.on();
    popcornPopper.pop();

    lights.dim();

    amplifier.on();
    amplifier.setVolume(11);

    projector.setInput(dvdPlayer);

    dvdPlayer.on();
    dvdPlayer.setCD("Raiders of the lost ark");
    dvdPlayer.play();
  }

  public void endMovie() {
    dvdPlayer.off();
    projector.off();
    amplifier.off();
    popcornPopper.off();
    lights.off();
  }
}
