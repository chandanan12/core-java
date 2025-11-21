package com.xworkz.abstraction.abstrct;

public abstract class IrrigationSystem {
    String type;
    public IrrigationSystem(String type){
        this();
        this.type=type;
    }
    public IrrigationSystem(){

    }
    public abstract void turnOnPump();
    public abstract void setWaterLevel();
   public abstract void startSprinklers();
    public abstract void monitorMoisture();
    public abstract void turnOffPump();
   public void systemBrand() {
        System.out.println("Brand: RainBird Smart Irrigation System");
    }

    public void irrigationMode() {
        System.out.println("Mode: Automatic Drip Irrigation Mode");
    }
   public static void irrigationVersion() {
        System.out.println("Irrigation Controller Version: 2.5.7");
    }

}




