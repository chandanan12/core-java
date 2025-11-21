package com.xworkz.abstraction.abstrct;

public abstract class Vehicle {
    int speed;
    public Vehicle(int speed){
        this();
        this.speed=speed;
    }
    public Vehicle(){

    }
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
//    public abstract void brake();
//    public abstract void fuelType();

    public static void vehicleRules() {

        System.out.println("All vehicles must follow road safety rules.");
    }

    public void serviceInfo()
    {
        System.out.println("Service required every 6 months.");
    }

    public void insuranceDetails() {

        System.out.println("Insurance is valid for 1 year.");
    }

}


