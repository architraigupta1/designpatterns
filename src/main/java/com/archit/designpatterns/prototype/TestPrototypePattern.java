package com.archit.designpatterns.prototype;

public class TestPrototypePattern {
  public static void main(String[] args) {
    CloneFactory animalMaker = new CloneFactory();
    Sheep originalSheep = new Sheep();

    Animal sheepClone = animalMaker.getClone(originalSheep);

    System.out.println(originalSheep);
    System.out.println(originalSheep.hashCode());

    System.out.println(sheepClone);
    System.out.println(sheepClone.hashCode());

  }
}
