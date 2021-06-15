package com.archit.designpatterns.state;

public class Sold implements State {

  private GumballMachine gumballMachine;

  public Sold(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Dispensing in progress. Please wait");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Dispensing in progress. Cannot eject quarter now");
  }

  @Override
  public void turnCrank() {
    System.out.println("Dispensing in progress. Please wait");
  }

  @Override
  public void dispense() {
    System.out.println("Here is your gumball!!");
    int count = gumballMachine.getBalls();
    count = count - 1;
    gumballMachine.setBalls(count);
    if (count == 0) {
      gumballMachine.setCurrentState(gumballMachine.getSoldOut());
    } else {
      gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
    }
  }

  @Override
  public String toString() {
    return "Gumball sold";
  }
}
