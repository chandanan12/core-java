package com.xworkz.abstraction.abstrct;

public abstract class Bluetooth {
    int price;
    public Bluetooth(int price){
        this.price=price;
    }
  public   abstract void turnOn();
   public abstract void turnOff();
   public abstract void connectDevice();
   public abstract void disconnectDevice();
    public abstract void checkBattery();

    public void showBrand() {
        System.out.println("Brand: JBL Go 3");
    }

    public void speakerMode() {
        System.out.println("Mode: Outdoor Bass Boost Mode");
    }
   public static void bluetoothVersion() {
        System.out.println("Bluetooth Version: 5.3");
    }

}


