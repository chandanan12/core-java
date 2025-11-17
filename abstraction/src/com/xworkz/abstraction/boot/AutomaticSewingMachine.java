package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.SewingMachine;

public class AutomaticSewingMachine extends SewingMachine {
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
