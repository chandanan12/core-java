package com.xworkz.access.internal;

class Car {
        String brand;
        Car(String carBrand) {
            brand = carBrand;
        }
        void displayBrand() {
            System.out.println("Car brand: " + brand);
        }
}