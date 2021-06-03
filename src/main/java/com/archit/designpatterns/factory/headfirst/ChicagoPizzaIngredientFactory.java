package com.archit.designpatterns.factory.headfirst;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Crust createCrust() {
    return new ThinCrust();
  }

  @Override
  public Cheese createCheese() {
    return new Cheddarcheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies[] veggies = { new Tomato(), new Onion() };
    return veggies;
  }
}
