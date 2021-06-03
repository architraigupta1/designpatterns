package com.archit.designpatterns.factory.headfirst;

public interface PizzaIngredientFactory {

  Crust createCrust();

  Cheese createCheese();

  Veggies[] createVeggies();
}
