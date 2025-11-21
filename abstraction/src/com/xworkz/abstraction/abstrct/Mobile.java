package com.xworkz.abstraction.abstrct;

public abstract class Mobile {
    boolean is5G;
    public Mobile(boolean is5G){
        this();
        this.is5G=is5G;
    }
    public Mobile(){

    }
   public abstract void call();
   public abstract void message();
   public abstract void camera();
  public   abstract void playMusic();
   public abstract void chargeBattery();
    public void showBrand() {

        System.out.println("Brand is Samsung Galaxy S24");
    }

   public void mobileMode() {

        System.out.println("Gaming Mode Enabled");
    }
    public static void osVersion() {

        System.out.println("Operating System: Android 14");
    }

}

