package com.archit.designpatterns.state;

public class GumballMachine {

  private String name;
  private State currentState;
  private State noQuarter = new NoQuarter(this);
  private State hasQuarter = new HasQuarter(this);
  private State sold = new Sold(this);
  private State soldOut = new SoldOut(this);
  private int balls;

  public GumballMachine(String name, int balls) {
    this.name = name;
      this.balls = balls;
      if (this.balls <= 0) {
        this.currentState = soldOut;
      } else {
        this.currentState = noQuarter;
      }
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
    currentState.insertQuarter();
  }

  public void ejectQuarter() {
    currentState.ejectQuarter();
  }

  public void turnCrank() {
    currentState.turnCrank();
    currentState.dispense();
  }

  public State getNoQuarter() {
    return noQuarter;
  }

  public State getHasQuarter() {
    return hasQuarter;
  }

  public State getSold() {
    return sold;
  }

  public State getSoldOut() {
    return soldOut;
  }

  public int getBalls() {
    return balls;
  }

  public void setBalls(int balls) {
    this.balls = balls;
  }
}
