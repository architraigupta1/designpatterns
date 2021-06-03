package com.archit.designpatterns.factory.headfirst;

import java.util.Arrays;

public abstract class Pizza {

  String name;
  Crust crust;
  Cheese cheese;
  Veggies[] veggies;

  PizzaIngredientFactory pizzaIngredientFactory;

  public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  public void prepare() {
    crust.display();
    cheese.display();
    Arrays.stream(veggies).forEach(veggie -> veggie.display());
  }

  public void bake() {
    System.out.println("Baking pizza: " + name);
  }

  public void cut() {
    System.out.println("Cutting pizza: " + name);
  }

  public void box() {
    System.out.println("Boxing pizza: " + name);
  }

}
