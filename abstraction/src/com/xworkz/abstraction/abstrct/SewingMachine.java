package com.xworkz.abstraction.abstrct;

public abstract class SewingMachine {
    double weight;
    public SewingMachine(double weight){
        this();
        this.weight=weight;
    }
    public SewingMachine(){

    }

    public abstract void startMachine();
   public abstract void stopMachine();
   public abstract void stitchCloth();
    public abstract void changeNeedle();
    public abstract void adjustSpeed();

    public void showModel() {
        System.out.println("Model: Singer AutoPro 5000");
    }

    public void showWarranty() {

        System.out.println("Warranty: 2 Years Full Replacement");
    }
    public static void machineCategory() {
        System.out.println("Category: Automatic Sewing Machine");
    }

}



