package com.archit.designpatterns.state;

public class SoldOut implements State {

  private GumballMachine gumballMachine;

  public SoldOut(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You did not insert any quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public void dispense() {
    System.out.println("There are no gumballs. Please wait");
  }

  @Override
  public String toString() {
    return "Gumball sold out. Please try again later";
  }
}
