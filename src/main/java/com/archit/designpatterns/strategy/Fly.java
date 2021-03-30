package com.archit.designpatterns.strategy;

public interface Fly {
  public void tryFly();
}

class CanFly implements Fly {

  @Override
  public void tryFly() {
    System.out.println("I can fly.");
  }
}

class CannotFly implements Fly {
  @Override
  public void tryFly() {
    System.out.println("I cannot fly");
  }
}