package com.archit.designpatterns.state;

public class Sold implements State {

  @Override
  public void insertQuarter(GumballMachine gumballMachine) {
    System.out.println("Dispensing in progress. Please wait");
  }

  @Override
  public void ejectQuarter(GumballMachine gumballMachine) {
    System.out.println("Dispensing in progress. Cannot eject quarter now");
  }

  @Override
  public void turnCrank(GumballMachine gumballMachine) {
    System.out.println("Dispensing in progress. Please wait");
  }

  @Override
  public void dispense(GumballMachine gumballMachine) {
    System.out.println("Here is your gumball!!");
    int count = gumballMachine.getBalls();
    count = count - 1;
    gumballMachine.setBalls(count);
    if (count == 0) {
      gumballMachine.setCurrentState(StateMachine.soldOut);
    } else {
      gumballMachine.setCurrentState(StateMachine.noQuarter);
    }
  }

  @Override
  public String toString() {
    return "Gumball sold";
  }
}
