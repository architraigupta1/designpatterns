package com.archit.designpatterns.state;

public class StateMachine {
  public final static State noQuarter = new NoQuarter();
  public final static State hasQuarter = new HasQuarter();
  public final static State sold = new Sold();
  public final static State soldOut = new SoldOut();
}
