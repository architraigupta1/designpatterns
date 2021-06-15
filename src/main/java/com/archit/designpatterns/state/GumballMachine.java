package com.archit.designpatterns.state;

public class GumballMachine {

  private String name;
  private State currentState;
  private int balls;

  public GumballMachine(String name, int balls, State currentState) {
    this.name = name;
    this.balls = balls;
    this.currentState = currentState;
  }

  public String display() {
    return "Machine: " + this.name
        + " current state: " + currentState.toString()
        + " Balls available: " + this.balls;
  }
  public State getCurrentState() {
    return currentState;
  }

  public void setCurrentState(State state) {
    this.currentState = state;
  }

  public void insertQuarter() {
    currentState.insertQuarter(this);
  }

  public void ejectQuarter() {
    currentState.ejectQuarter(this);
  }

  public void turnCrank() {
    currentState.turnCrank(this);
    currentState.dispense(this);
  }

  public int getBalls() {
    return balls;
  }

  public void setBalls(int balls) {
    this.balls = balls;
  }
}
