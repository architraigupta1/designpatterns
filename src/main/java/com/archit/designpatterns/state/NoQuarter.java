package com.archit.designpatterns.state;

public class NoQuarter implements State {

  private GumballMachine gumballMachine;

  public NoQuarter(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Quarter inserted.");
    gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("No quarter present");
  }

  @Override
  public void turnCrank() {
    System.out.println("Please insert a quarter first");
  }

  @Override
  public void dispense() {
    System.out.println("Please insert a quarter first");
  }

  @Override
  public String toString() {
    return "Machine has no quarter";
  }
}
