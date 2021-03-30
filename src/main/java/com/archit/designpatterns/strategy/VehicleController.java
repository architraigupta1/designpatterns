package com.archit.designpatterns.strategy;

/**
 * This is the controller class to test the Strategy pattern.
 * Here if we want to give an flying ability to aeroplane but not to any other vehicle,
 * we have several (bad) options.
 * 1. Create a Fly() in Vehicle parent class with the default of "cannot fly" and override it in
 * all child classes (old and new) that can fly
 * 2. Create a separate method only in aeroplance class and all the other classes (old & new) that support flying
 * 3. Best option is to use Strategy pattern here
 * -
 *
 */
public class VehicleController {
  public static void main(String[] args) {
    Vehicle plane = new AeroPlane("klm");
    Vehicle car = new Car("tesla");
    Vehicle bike = new Bike("avenger");

    plane.getSpecifications();
    car.getSpecifications();

    //check if the vehicle can fly or not
    car.tryToFly();
    plane.tryToFly();

    //give car ability to fly
    car.setFly(new CanFly());
    car.tryToFly();
  }
}
