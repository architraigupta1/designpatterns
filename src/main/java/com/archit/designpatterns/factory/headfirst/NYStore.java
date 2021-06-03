package com.archit.designpatterns.factory.headfirst;

import java.io.InvalidClassException;

public class NYStore extends PizzaStore {

  PizzaIngredientFactory pizzaIngredientFactory;

  public NYStore() {
    this.pizzaIngredientFactory = new NYPizzaIngredientFactory();
  }

  //Factory method defines which concrete object to create
  @Override
  public Pizza createPizza(String name) throws InvalidClassException {
    if (name.equals("cheese")) {
      return new NYCheesePizza(pizzaIngredientFactory);
    } else if (name.equals("veggie")) {
      return new NYVeggiePizza(pizzaIngredientFactory);
    } else {
      throw new InvalidClassException("no pizza of this name");
    }
  }
}
