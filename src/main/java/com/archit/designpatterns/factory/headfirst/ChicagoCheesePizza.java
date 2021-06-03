package com.archit.designpatterns.factory.headfirst;

import java.util.Arrays;

public class ChicagoCheesePizza extends Pizza {

  public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    super(pizzaIngredientFactory);
    this.name = "Chicago Cheese Pizza";
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
