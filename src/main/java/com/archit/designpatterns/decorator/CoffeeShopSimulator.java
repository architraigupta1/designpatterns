package com.archit.designpatterns.decorator;

public class CoffeeShopSimulator {
  public static void main(String[] args) {
    Beverage houseBlend = new HouseBlend();
    Beverage singleMocha = new Mocha(houseBlend);
    Beverage doubleMocha = new Mocha(singleMocha);
    Beverage soy = new Soy(doubleMocha);
    Beverage whip = new Whip(soy);

    System.out.println("Name: " + whip.getDescription() + " Cost: " + whip.getCost());

//    Better way is to use re-use one object reference
    Beverage beverage = new HouseBlend();
    beverage = new Mocha(beverage);
    beverage = new Mocha(beverage);
    beverage = new Soy(beverage);
    beverage = new Whip(beverage);

    System.out.println("Name: " + beverage.getDescription() + " Cost: " + beverage.getCost());
  }
}
