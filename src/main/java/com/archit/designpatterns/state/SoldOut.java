package com.archit.designpatterns.state;

public class SoldOut implements State {

  @Override
  public void insertQuarter(GumballMachine gumballMachine) {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public void ejectQuarter(GumballMachine gumballMachine) {
    System.out.println("You did not insert any quarter");
  }

  @Override
  public void turnCrank(GumballMachine gumballMachine) {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public void dispense(GumballMachine gumballMachine) {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public String toString() {
    return "Gumball sold out. Please try again later";
  }
}
