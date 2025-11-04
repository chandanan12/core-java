package com.xworkz.multiinheritance.internal;

public class Vehicle {
        protected String type;
        protected Vehicle(String vehicleType) {
            type = vehicleType;
        }
        protected void showType() {
            System.out.println("Vehicle type: " + type);
        }
}

