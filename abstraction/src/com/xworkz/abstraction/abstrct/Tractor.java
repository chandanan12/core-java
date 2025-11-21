package com.xworkz.abstraction.abstrct;

public abstract class Tractor {
    float enginePower;
    public Tractor(float enginePower){
        this();
        this.enginePower=enginePower;
    }
    public Tractor(){

    }
   public abstract void startEngine();
   public abstract void ploughField();
    public abstract void sowSeeds();
   public abstract void carryLoad();
   public abstract void stopEngine();
    public void showBrand() {
        System.out.println("Brand: Mahindra Arjun 605 DI");
    }

    public void tractorMode() {
        System.out.println("Mode: Heavy Duty Farming Mode");
    }

    public static void tractorVersion() {
        System.out.println("Tractor Software Version: 1.8.4");
    }

}
