package com.archit.designpatterns.factory.headfirst;

import java.io.InvalidClassException;

public class ChicagoStore extends PizzaStore {

  PizzaIngredientFactory pizzaIngredientFactory;

  public ChicagoStore() {
    this.pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
  }

  //Factory method defines which concrete object to create
  @Override
  public Pizza createPizza(String name) throws InvalidClassException {
    if (name.equals("cheese")) {
      return new ChicagoCheesePizza(this.pizzaIngredientFactory);
    } else if (name.equals("veggie")) {
      return new ChicagoVeggiePizza(this.pizzaIngredientFactory);
    } else {
      throw new InvalidClassException("no pizza with this name");
    }
  }
}
