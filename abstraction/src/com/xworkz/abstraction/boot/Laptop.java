package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Computer;

public class Laptop extends Computer {
    public Laptop(String color) {
        super(color);
    }
    @Override
    public void deviceInfo() {
        System.out.println("Device Type Personal Computer.");
    }


    public void boot() { System.out.println("Laptop booting up."); }
    public void shutdown() { System.out.println("Laptop shutting down."); }
    public void installSoftware() { System.out.println("Installing MS Office."); }
    public void uninstallSoftware() { System.out.println("Uninstalling antivirus."); }
    public void runProgram() { System.out.println("Running Chrome browser."); }
}

