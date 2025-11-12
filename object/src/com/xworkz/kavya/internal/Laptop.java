package com.xworkz.kavya.internal;

public class Laptop {
        String model;
        int ram;
        double price;

        public Laptop(String model, int ram, double price) {
            this.model = model;
            this.ram = ram;
            this.price = price;
        }

        public void info() {
            System.out.println("Model: " + this.model);
            System.out.println("RAM: " + this.ram + "GB");
            System.out.println("Price: ₹" + this.price);
        }

    }

