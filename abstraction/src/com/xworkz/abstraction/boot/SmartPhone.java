package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Mobile;

public class SmartPhone extends Mobile {
    public SmartPhone(boolean is5G){
        super(is5G);
    }
    @Override
    public void mobileMode() {
    }
    public   void call() {

        System.out.println("Calling a contact...");
    }
    public void message() {

        System.out.println("Sending a text message...");
    }
    public void camera() {

        System.out.println("Taking a photo using 108MP camera.");
    }
    public void playMusic() {
        System.out.println("Playing music using the mobile music player.");
    }
    public void chargeBattery() {
        System.out.println("Battery charging using fast charging.");
    }
}
