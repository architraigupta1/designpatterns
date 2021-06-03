package com.archit.designpatterns.factory.headfirst;

import java.io.InvalidClassException;

public class PizzaStoreSimulator {
  public static void main(String[] args) throws InvalidClassException {
    PizzaStore nyPizzaStore = new NYStore();
    PizzaStore chicagoPizzaStore = new ChicagoStore();

    nyPizzaStore.orderPizza("cheese");
    System.out.println("\n~~~~~~~~~~~~~~~\n");
    chicagoPizzaStore.orderPizza("veggie");
  }
}
