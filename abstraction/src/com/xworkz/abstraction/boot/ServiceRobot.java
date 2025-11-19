package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Robot;

public class ServiceRobot extends Robot {
    public ServiceRobot(char grade) {
        super(grade);
    }
    @Override
    public void batteryStatus() {
        System.out.println("Battery Status 85% remaining.");
    }

    public void startTask() { System.out.println("Robot starts cleaning."); }
    public void stopTask() { System.out.println("Robot stops task."); }
    public   void chargeBattery() { System.out.println("Robot charging."); }
    public void speak() { System.out.println("Robot says: Hello human!"); }
    public void walk() { System.out.println("Robot walking forward."); }
}