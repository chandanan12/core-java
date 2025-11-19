package com.xworkz.abstraction.abstrct;

public abstract class Computer {
    String color;
    public Computer(String color){
        this();
        this.color=color;
    }
    public Computer(){}


   public abstract void boot();
   public abstract void shutdown();
    public abstract void installSoftware();
   public abstract void uninstallSoftware();
   public abstract void runProgram();
   public static void computerRules() {
        System.out.println("All computers must follow hardware compatibility standards.");
    }
    public void deviceInfo() {
        System.out.println("Device Type: Personal Computer.");
    }

    public void warrantyStatus() {
        System.out.println("Warranty: 1 year onsite service.");
    }

}
