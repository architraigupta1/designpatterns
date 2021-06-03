package com.archit.designpatterns.factory.headfirst;

import java.util.Arrays;

public class NYCheesePizza extends Pizza {

  public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    super(pizzaIngredientFactory);
    this.name = "NY Cheese Pizza";
  }

  @Override
  public void prepare() {
    System.out.println("preparing pizza: " + name);
    crust = pizzaIngredientFactory.createCrust();
    cheese = pizzaIngredientFactory.createCheese();
    veggies = pizzaIngredientFactory.createVeggies();
    super.prepare();
  }
}
