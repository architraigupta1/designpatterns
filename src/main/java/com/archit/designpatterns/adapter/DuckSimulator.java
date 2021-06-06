package com.archit.designpatterns.adapter;

public class DuckSimulator {
  public static void main(String[] args) {
    Duck duck = new MallardDuck();
    duck.quack();
    duck.fly();

    Turkey wildTurkey = new WildTurkey();
    wildTurkey.gobble();
    wildTurkey.fly();

    Duck fakeDuck = new TurkeyAdapter(wildTurkey);
    fakeDuck.quack();
    fakeDuck.fly();

  }
}
