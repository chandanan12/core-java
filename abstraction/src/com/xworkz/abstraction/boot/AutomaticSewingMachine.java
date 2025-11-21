package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.SewingMachine;

public class AutomaticSewingMachine extends SewingMachine {
    public AutomaticSewingMachine(double weight) {
        super(weight);
    }
@Override
public void showModel() {
    System.out.println("Model Singer AutoPro 5000");
}

    public void startMachine() {
        System.out.println("Sewing machine started.");
    }
    public void stopMachine() {
        System.out.println("Sewing machine stopped.");
    }
   public void stitchCloth() {
        System.out.println("Stitching cloth in straight pattern.");
    }
   public void changeNeedle() {
        System.out.println("Needle changed for thick fabric.");
    }
   public void adjustSpeed() {
        System.out.println("Adjusting stitching speed to medium.");
    }
}
