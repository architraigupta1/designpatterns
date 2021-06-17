package com.archit.designpatterns.compoundpattern;

public class DuckFactory extends AbstractDuckFactory {

  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }

  @Override
  public Quackable createRedHeadedDuck() {
    return new RedHeadedDuck();
  }

  @Override
  public Quackable createDuckCall() {
    return new DuckCall();
  }

  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }
}
