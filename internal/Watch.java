package com.xworkz.object.internal;

public class Watch {
    public String brand;
    public String model;
    public int warrantyYears;
    public double price;
    public boolean isSmart;
    public float screenSize;
    public char strapType;
    public long serialNumber;

    public Watch() {
        System.out.println("Watch object created");
    }

    public Watch(String brand, String model, int warrantyYears, double price, boolean isSmart, float screenSize, char strapType, long serialNumber) {
        this.brand = brand;
        this.model = model;
        this.warrantyYears = warrantyYears;
        this.price = price;
        this.isSmart = isSmart;
        this.screenSize = screenSize;
        this.strapType = strapType;
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return "Watch{brand=" + brand + ", model=" + model + ", warrantyYears=" + warrantyYears +
                ", price=" + price + ", isSmart=" + isSmart + ", screenSize=" + screenSize +
                ", strapType=" + strapType + ", serialNumber=" + serialNumber + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Watch)) return false;
        Watch w = (Watch) obj;
        return brand.equals(w.brand) && model.equals(w.model) &&
                warrantyYears == w.warrantyYears && price == w.price &&
                isSmart == w.isSmart && screenSize == w.screenSize &&
                strapType == w.strapType && serialNumber == w.serialNumber;
    }
}
