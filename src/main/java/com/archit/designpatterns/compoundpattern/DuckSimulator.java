package com.archit.designpatterns.compoundpattern;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    duckSimulator.simulate(duckFactory);
  }

  private void simulate(AbstractDuckFactory duckFactory) {
    Quackologist quackologist = new Quackologist();
    Flock flockOfDucks = new Flock();
    Quackable redheadedDuck = duckFactory.createRedHeadedDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());

    redheadedDuck.registerObserver(quackologist);
    gooseDuck.registerObserver(quackologist);

    flockOfDucks.add(redheadedDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    Quackable mallardDuck1 = duckFactory.createMallardDuck();
    Quackable mallardDuck2 = duckFactory.createMallardDuck();
    Quackable mallardDuck3 = duckFactory.createMallardDuck();
    Quackable mallardDuck4 = duckFactory.createMallardDuck();

    Flock flockOfMallards = new Flock();
    flockOfMallards.add(mallardDuck1);
    flockOfMallards.add(mallardDuck2);
    flockOfMallards.add(mallardDuck3);
    flockOfMallards.add(mallardDuck4);

    flockOfMallards.registerObserver(quackologist);

    flockOfDucks.add(flockOfMallards);


    simulate(flockOfDucks);

    System.out.println("Total number of quacks counted: " + QuackCountable.getCount());
  }

  private void simulate(Quackable quackable) {
    quackable.quack();
  }
}
