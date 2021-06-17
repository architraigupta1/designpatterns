package com.archit.designpatterns.compoundpattern;

public abstract class AbstractDuckFactory {

  public abstract Quackable createMallardDuck();
  public abstract Quackable createRedHeadedDuck();
  public abstract Quackable createDuckCall();
  public abstract Quackable createRubberDuck();
}
