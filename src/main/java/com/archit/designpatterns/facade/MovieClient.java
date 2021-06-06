package com.archit.designpatterns.facade;

public class MovieClient {
  public static void main(String[] args) {
    PopcornPopper popcornPopper = new PopcornPopper();
    TheaterLights lights = new TheaterLights();
    Amplifier amplifier = new Amplifier();
    DvdPlayer dvdPlayer = new DvdPlayer();
    Projector projector = new Projector();

    //Without a Facade
    System.out.println("~~~~~~~~~Watching movie without a facade\n\n");
    popcornPopper.on();
    popcornPopper.pop();

    lights.dim();

    amplifier.on();
    amplifier.setVolume(11);

    projector.setInput(dvdPlayer);

    dvdPlayer.on();
    dvdPlayer.setCD("Raiders of the lost ark");
    dvdPlayer.play();

    //With a facade
    System.out.println("\n\n~~~~~~~~~Watching movie with a facade");
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(popcornPopper, lights,
        amplifier, dvdPlayer, projector);
    homeTheater.watchMovie();

    System.out.println("\n\n~~~~~~~~~Ending movie with a facade");
    homeTheater.endMovie();

  }
}
