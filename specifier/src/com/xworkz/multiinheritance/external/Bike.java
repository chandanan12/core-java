package com.xworkz.multiinheritance.external;

import com.xworkz.multiinheritance.internal.Vehicle;

public class Bike extends Vehicle {
    public Bike(String vehicleType) {
        super(vehicleType);
    }
    public static void main(String[] args) {
        Bike b = new Bike("Two-Wheeler");
        b.showType();
    }
}

