package com.xworkz.abstraction.abstrct;

public abstract class Transport {
 int speed;
 public Transport(int speed){
     this();
     this.speed=speed;
 }
 public Transport(){

 }
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void refuel();
    public abstract void honk();
    public static void transportRules() {
        System.out.println("All transport vehicles must follow traffic and safety rules.");
    }
    public void serviceDetails() {

        System.out.println("Service required every 5000 km.");
    }

    public void vehicleType() {
        System.out.println("Vehicle Type: Public Transport.");
    }

}
