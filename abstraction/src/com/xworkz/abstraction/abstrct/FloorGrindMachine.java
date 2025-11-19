package com.xworkz.abstraction.abstrct;


public abstract class FloorGrindMachine {
    double weight;
    public FloorGrindMachine(double weight){
        this.weight=weight;
    }
  public   abstract void startMachine();
   public abstract void stopMachine();
   public abstract void adjustSpeed();
   public abstract void replaceBlade();
   public abstract void cleanSurface();
    public void showBrand() {
        System.out.println("Brand is Bosch Floor Grinder");
    }
    public void showPower() {
        System.out.println("Power is 1500W Heavy Duty Motor");
    }
    public static void machineType() {
        System.out.println("Machine Type is  Industrial Floor Grinding Machine");
    }

}

