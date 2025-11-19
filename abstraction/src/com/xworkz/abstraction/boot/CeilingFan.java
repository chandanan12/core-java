package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Fan;

public class CeilingFan extends Fan {
    public CeilingFan(double price) {
        super(price);
    }

    @Override
    public void showBrand() {
        System.out.println("fan brand is usha");
    }
    public void turnOn() {
        System.out.println("Ceiling fan is turned ON.");
    }

    public void turnOff() {
        System.out.println("Ceiling fan is turned OFF.");
    }

    public void increaseSpeed() {
        System.out.println("Increasing fan speed to high.");
    }

    public void decreaseSpeed() {
        System.out.println("Decreasing fan speed to low.");
    }

    public void rotate() {
        System.out.println("Fan blades are rotating clockwise.");

    }
}