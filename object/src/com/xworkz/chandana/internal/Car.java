package com.xworkz.chandana.internal;

public class Car {
        String brand;
        double price;

      public   Car(String brand, double price) {
            this.brand = brand;
            this.price = price;
        }

       public void show() {
            System.out.println("Brand: " + this.brand);
            System.out.println("Price: " + this.price);
        }
    }

