package com.archit.designpatterns.state;

public class GumballSimulator {

  public static void main(String[] args) {
    GumballMachine gumballMachineA = new GumballMachine("Machine A", 10, StateMachine.noQuarter);
    GumballMachine gumballMachineB = new GumballMachine("Machine B", 1, StateMachine.noQuarter);

    System.out.println(gumballMachineA.display());
    gumballMachineA.insertQuarter();
    System.out.println(gumballMachineA.display());
    gumballMachineA.turnCrank();
    System.out.println(gumballMachineA.display());

    System.out.println(gumballMachineB.display());
    gumballMachineB.insertQuarter();
    System.out.println(gumballMachineB.display());
    gumballMachineB.turnCrank();
    System.out.println(gumballMachineB.display());
    gumballMachineB.insertQuarter();
    System.out.println(gumballMachineB.display());
    gumballMachineB.turnCrank();
    System.out.println(gumballMachineB.display());

  }
}
