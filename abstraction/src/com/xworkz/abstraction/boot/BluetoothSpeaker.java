package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Bluetooth;

public class BluetoothSpeaker extends Bluetooth {
   public void turnOn() {
        System.out.println("Bluetooth speaker turned ON.");
    }
    public void turnOff() {
        System.out.println("Bluetooth speaker turned OFF.");
    }
   public void connectDevice() {
        System.out.println("Bluetooth speaker connected to mobile.");
    }
   public void disconnectDevice() {
        System.out.println("Bluetooth speaker disconnected from mobile.");
    }
    public void checkBattery() {
        System.out.println("Battery level is 80%.");
    }
}

