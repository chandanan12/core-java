package com.xworkz.abstraction.abstrct;

public abstract class EmbroideryMachine {
    String brand;
    public EmbroideryMachine(String brand){
        this();
        this.brand=brand;
    }
    public EmbroideryMachine(){

    }
    public abstract void startMachine();
   public abstract void stopMachine();
    public abstract void loadPattern();
    public abstract void changeThreadColor();
    public abstract void adjustSpeed();

    public void showBrand()
    {
        System.out.println("Brand is Brother Innov-is Series");
    }

    public void machineMode() {
        System.out.println("it is a Automatic Embroidery Mode");
    }
    public static void machineVersion() {
        System.out.println("Software Version: 3.2");
    }


}
