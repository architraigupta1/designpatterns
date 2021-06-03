package com.archit.designpatterns.factory.headfirst;

public class NYVeggiePizza extends Pizza {

  public NYVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    super(pizzaIngredientFactory);
    this.name = "NY Veggie Pizza";
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
