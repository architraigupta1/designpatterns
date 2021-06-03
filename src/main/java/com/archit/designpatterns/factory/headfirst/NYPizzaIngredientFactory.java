package com.archit.designpatterns.factory.headfirst;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Crust createCrust() {
    return new ThickCrust();
  }

  @Override
  public Cheese createCheese() {
    return new GowdaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies[] veggies = { new Tomato(), new Onion(), new Capsicum() };
    return veggies;
  }
}
