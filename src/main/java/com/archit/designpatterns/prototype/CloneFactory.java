package com.archit.designpatterns.prototype;

public class CloneFactory {

  public Animal getClone(Animal animalSample) {
    return animalSample.makeCopy();
  }
}
