package com.archit.designpatterns.factory.headfirst;

import java.util.Arrays;

public class ChicagoVeggiePizza extends Pizza {

  public ChicagoVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    super(pizzaIngredientFactory);
    this.name = "Chicago Veggie Pizza";
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
