package com.xworkz.object.internal;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public boolean isElectric;
    public char fuelType;
    public float engineCapacity;
    public long registrationNumber;

    public Car() {
        System.out.println("Car object created");
    }

    public Car(String brand, String model, int year, double price, boolean isElectric, char fuelType, float engineCapacity, long registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isElectric = isElectric;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return "Car{brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price +
                ", isElectric=" + isElectric + ", fuelType=" + fuelType +
                ", engineCapacity=" + engineCapacity + ", registrationNumber=" + registrationNumber + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car c = (Car) obj;
        return brand.equals(c.brand) && model.equals(c.model) && year == c.year &&
                price == c.price && isElectric == c.isElectric &&
                fuelType == c.fuelType && engineCapacity == c.engineCapacity &&
                registrationNumber == c.registrationNumber;
    }
}
