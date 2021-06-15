package com.archit.designpatterns.state;

public class HasQuarter implements State {

  private GumballMachine gumballMachine;

  public HasQuarter(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Quarter already inserted");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter ejected");
    gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
  }

  @Override
  public void turnCrank() {
    System.out.println("Dispensing a ball now");
    gumballMachine.setCurrentState(gumballMachine.getSold());
  }

  @Override
  public void dispense() {
    System.out.println("Dispensing already in progress");
  }

  @Override
  public String toString() {
    return "Machine has a quarter";
  }
}
