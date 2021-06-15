package com.archit.designpatterns.state;

public class HasQuarter implements State {

  @Override
  public void insertQuarter(GumballMachine gumballMachine) {
    System.out.println("Quarter already inserted");
  }

  @Override
  public void ejectQuarter(GumballMachine gumballMachine) {
    System.out.println("Quarter ejected");
    gumballMachine.setCurrentState(StateMachine.noQuarter);
  }

  @Override
  public void turnCrank(GumballMachine gumballMachine) {
    System.out.println("Dispensing a ball now");
    gumballMachine.setCurrentState(StateMachine.sold);
  }

  @Override
  public void dispense(GumballMachine gumballMachine) {
    System.out.println("Dispensing already in progress");
  }

  @Override
  public String toString() {
    return "Machine has a quarter";
  }
}
