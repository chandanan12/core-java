package com.xworkz.abstraction.abstrct;

public abstract class Fan {
    double price;
    public Fan(double price){
        this();
        this.price=price;
    }
    public Fan(){

    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void increaseSpeed();

    public abstract void decreaseSpeed();

    public abstract void rotate();

    public void showBrand() {
        System.out.println("Brand is Usha Ceiling Fan");
    }

    public void showColor() {
        System.out.println("the color is Brown");
    }

    public static void powerSupplyType() {
        System.out.println("Power Supply: 220V AC");

    }
}





