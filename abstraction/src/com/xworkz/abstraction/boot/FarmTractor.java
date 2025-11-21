package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Tractor;

public class FarmTractor extends Tractor {
    public FarmTractor(float enginePower) {
        super(enginePower);
    }
    @Override
    public void showBrand() {
        System.out.println("Brand Mahindra Arjun 605 DI");
    }

    public void startEngine() {
        System.out.println("Tractor engine started.");
    }
   public void ploughField() {
        System.out.println("Tractor is ploughing the field.");
    }
    public void sowSeeds() {
        System.out.println("Seeds are being sown using the seed drill.");
    }
   public void carryLoad() {
        System.out.println("Tractor carrying harvested crops to the barn.");
    }
    public void stopEngine() {
        System.out.println("Tractor engine stopped.");
    }
}