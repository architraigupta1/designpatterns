package com.archit.designpatterns.compoundpattern;

public class CountingDuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new QuackCountable(new MallardDuck());
  }

  @Override
  public Quackable createRedHeadedDuck() {
    return new QuackCountable(new RedHeadedDuck());
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
