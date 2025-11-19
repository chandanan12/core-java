package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Appliance;

public class WashingMachine extends Appliance {
    public WashingMachine(int price){
        super( price);
    }
    @Override
    public void warrantyInfo() {

        System.out.println("Warranty at 2 years on product.");
    }
   public void turnOn()
    { System.out.println("Washing machine turned on."); }
    public void turnOff()
    { System.out.println("Washing machine turned off."); }
    public void repair()
    { System.out.println("Servicing the washing machine."); }
    public void energyUse()
    { System.out.println("Consumes 2 units/hour."); }
    public void brand()
    { System.out.println("Brand: LG."); }
}