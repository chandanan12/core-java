package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.EmbroideryMachine;

public class ComputerizedEmbroidery extends EmbroideryMachine {
    public ComputerizedEmbroidery(String brand) {
        super(brand);
    }
@Override
public void machineMode() {
    System.out.println("it is  Automatic Embroidery Mode");
}
    public void startMachine() {
        System.out.println("Embroidery machine started.");
    }
   public void stopMachine() {
        System.out.println("Embroidery machine stopped.");
    }
   public void loadPattern() {
        System.out.println("Loaded floral embroidery pattern.");
    }
    public void changeThreadColor() {
        System.out.println("Thread color changed to red.");
    }
    public void adjustSpeed() {
        System.out.println("Speed adjusted for precision work.");
    }
}

