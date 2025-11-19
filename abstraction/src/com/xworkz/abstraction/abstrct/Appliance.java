package com.xworkz.abstraction.abstrct;

public abstract class Appliance {
    int price;
    public Appliance(int price){
        this();
        this.price=price;
    }
    public Appliance(){

    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void repair();

    public abstract void energyUse();

    public abstract void brand();

    public static void applianceRules() {

        System.out.println("All appliances must follow BIS safety standards.");
    }

    public void warrantyInfo() {

        System.out.println("Warranty: 2 years on product.");
    }

    public void customerSupport() {
        System.out.println("Customer support available 24/7.");

    }
}





