package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Vehicle;

public class Car extends Vehicle {
    String brand = "Toyota";

    public void displayBrand() {
        System.out.println("Car brand: " + brand);
    }
}