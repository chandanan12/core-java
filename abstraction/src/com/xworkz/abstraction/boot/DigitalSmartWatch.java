package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.SmartWatch;

public class DigitalSmartWatch extends SmartWatch {
  public   void trackSteps() {
        System.out.println("Tracking daily steps...");
    }
    public void checkHeartRate() {
        System.out.println("Heart rate monitored: 78 BPM.");
    }
    public void showNotifications() {
        System.out.println("Displaying mobile notifications.");
    }
   public void connectMobile() {
        System.out.println("Smartwatch connected to mobile via Bluetooth.");
    }
    public void chargeWatch() {
        System.out.println("Charging smartwatch using magnetic charger.");
    }
}
