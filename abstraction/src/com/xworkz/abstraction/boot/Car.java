package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Vehicle;

public class Car extends Vehicle {
    public void start() { System.out.println("Car starts with key ignition."); }
    public void stop() { System.out.println("Car stops with brake pedal."); }
    public void accelerate() { System.out.println("Car accelerates smoothly."); }
    public void brake() { System.out.println("Car brakes applied."); }
    public void fuelType() { System.out.println("Car uses petrol or diesel."); }
}