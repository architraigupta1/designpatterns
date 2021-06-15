package com.archit.designpatterns.state;

public class NoQuarter implements State {

  @Override
  public void insertQuarter(GumballMachine gumballMachine) {
    System.out.println("Quarter inserted.");
    gumballMachine.setCurrentState(StateMachine.hasQuarter);
  }

  @Override
  public void ejectQuarter(GumballMachine gumballMachine) {
    System.out.println("No quarter present");
  }

  @Override
  public void turnCrank(GumballMachine gumballMachine) {
    System.out.println("Please insert a quarter first");
  }

  @Override
  public void dispense(GumballMachine gumballMachine) {
    System.out.println("Please insert a quarter first");
  }

  @Override
  public String toString() {
    return "Machine has no quarter";
  }
}
