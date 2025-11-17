package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.IrrigationSystem;

public class DripIrrigation extends IrrigationSystem {
   public void turnOnPump() {
        System.out.println("Water pump turned ON.");
    }
   public void setWaterLevel() {
        System.out.println("Water level set to 30 liters per minute.");
    }
   public void startSprinklers() {
        System.out.println("Sprinklers are distributing water evenly.");
    }
    public void monitorMoisture() {
        System.out.println("Soil moisture monitored using sensors.");
    }
    public void turnOffPump() {
        System.out.println("Water pump turned OFF after irrigation.");
    }
}
