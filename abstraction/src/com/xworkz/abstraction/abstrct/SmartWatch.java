package com.xworkz.abstraction.abstrct;

public abstract class SmartWatch {
    float heart_rate;
    public SmartWatch(float heart_rate){
        this();
        this.heart_rate=heart_rate;
    }
    public SmartWatch(){

    }

  public   abstract void trackSteps();
   public abstract void checkHeartRate();
   public abstract void showNotifications();
    public abstract void connectMobile();
    public abstract void chargeWatch();
    public void showBrand() {
        System.out.println("Brand: Apple Watch Series 9");
    }

    public void watchMode() {
        System.out.println("Mode: Fitness Tracking Mode Enabled");
    }

    public static void softwareVersion() {
        System.out.println("WatchOS Version: 10.3");
    }

}


