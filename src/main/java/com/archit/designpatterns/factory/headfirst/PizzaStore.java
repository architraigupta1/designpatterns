package com.archit.designpatterns.factory.headfirst;

import java.io.InvalidClassException;

public abstract class PizzaStore {

  abstract Pizza createPizza(String name) throws InvalidClassException;

  public Pizza orderPizza(String name) throws InvalidClassException {
    Pizza pizza = createPizza(name);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
