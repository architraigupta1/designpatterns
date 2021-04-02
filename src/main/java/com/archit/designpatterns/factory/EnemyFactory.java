package com.archit.designpatterns.factory;

public class EnemyFactory {

  public EnemyShip createEnemyShip(String type) {
    if (type.equals("U")) {
      return new UfoEnemyship("UFO", 20);
    } else if (type.equals("R")) {
      return new RocketEnemyShip("Rocket", 35);
    } else {
      return null;
    }
  }
}
