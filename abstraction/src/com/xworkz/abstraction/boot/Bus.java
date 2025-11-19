package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Transport;

public class Bus extends Transport {
    public Bus(int speed) {
        super(speed);
    }

    @Override
    public void vehicleType() {
        System.out.println("Vehicle Type is Public Transport.");
    }


    public   void start() { System.out.println("Bus engine started."); }
    public void stop() { System.out.println("Bus stopped at station."); }
    public void accelerate() { System.out.println("Bus accelerating."); }
    public void refuel() { System.out.println("Bus refueled with diesel."); }
    public void honk() { System.out.println("Bus honking loudly!"); }
}
