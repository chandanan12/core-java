package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.FloorGrindMachine;

public class ConcreteGrinder extends FloorGrindMachine {
    public void startMachine() {
        System.out.println("Floor grinding machine started.");
    }
    public void stopMachine() {
        System.out.println("Floor grinding machine stopped.");
    }
   public void adjustSpeed() {
        System.out.println("Speed adjusted to medium for smooth grinding.");
    }
    public void replaceBlade() {
        System.out.println("Grinding blade replaced safely.");
    }
    public void cleanSurface() {
        System.out.println("Surface cleaned after grinding process.");
    }
}
