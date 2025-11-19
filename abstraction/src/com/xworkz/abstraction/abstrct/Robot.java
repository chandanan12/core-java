package com.xworkz.abstraction.abstrct;

public abstract class Robot {
    char grade;
    public Robot(char grade){
        this();
        this.grade=grade;
    }
    public Robot(){

    }
   public abstract void startTask();
   public abstract void stopTask();
   public abstract void chargeBattery();
   public abstract void speak();
   public abstract void walk();
    public static void robotGuidelines() {
        System.out.println("All robots must follow AI safety and operation guidelines.");
    }

    public void batteryStatus() {
        System.out.println("Battery Status: 85% remaining.");
    }

    public void maintenanceInfo() {

        System.out.println("Maintenance required every 30 days.");
    }

}



