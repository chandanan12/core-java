package com.xworkz.abstraction.abstrct;

public abstract class PowerBank {
    int capacity;
    public PowerBank(int capacity){
        this();
        this.capacity=capacity;
    }
    public PowerBank(){

    }
   public abstract void turnOn();
    public abstract void chargeMobile();
    public abstract void checkBatteryLevel();
   public abstract void enableFastCharging();
    public abstract void turnOff();

    public void displayBrand() {
        System.out.println("Brand Mi PowerBank");
    }
    public void displayCapacity() {
        System.out.println("Capacity: 20000mAh");
    }
    public static void powerBankInfo() {
        System.out.println("Static Info: This PowerBank supports fast charging.");
    }
}


