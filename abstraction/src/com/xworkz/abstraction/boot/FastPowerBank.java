package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.PowerBank;

public class FastPowerBank extends PowerBank {
    public FastPowerBank(int capacity) {
        super(capacity);
    }
@Override
public void displayBrand() {
    System.out.println("Brand MI PowerBank");
}

    public void turnOn() {

        System.out.println("Powerbank turned ON.");
    }
    public void chargeMobile() {
        System.out.println("Mobile charging through powerbank.");
    }
    public void checkBatteryLevel() {
        System.out.println("Battery level: 65%.");
    }
    public void enableFastCharging() {
        System.out.println("Fast charging enabled.");
    }
    public void turnOff() {
        System.out.println("Powerbank turned OFF.");
    }
}
