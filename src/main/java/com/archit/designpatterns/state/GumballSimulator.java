package com.archit.designpatterns.state;

public class GumballSimulator {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine("Machine A", 10);
    System.out.println(gumballMachine.display());
    gumballMachine.insertQuarter();
    System.out.println(gumballMachine.display());
    gumballMachine.turnCrank();
    System.out.println(gumballMachine.display());

  }
}
