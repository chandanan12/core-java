package com.xworkz.object.internal;

public class Laptop {
    public String brand;
    public String processor;
    public int ramGB;
    public double storageGB;
    public boolean hasGraphicsCard;
    public float screenSize;
    public char osType;
    public long serialNumber;

    public Laptop() {
        System.out.println("Laptop object created");
    }

    public Laptop(String brand, String processor, int ramGB, double storageGB, boolean hasGraphicsCard, float screenSize, char osType, long serialNumber) {
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.hasGraphicsCard = hasGraphicsCard;
        this.screenSize = screenSize;
        this.osType = osType;
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return "Laptop{brand=" + brand + ", processor=" + processor + ", ramGB=" + ramGB + ", storageGB=" + storageGB +
                ", hasGraphicsCard=" + hasGraphicsCard + ", screenSize=" + screenSize +
                ", osType=" + osType + ", serialNumber=" + serialNumber + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Laptop)) return false;
        Laptop l = (Laptop) obj;
        return brand.equals(l.brand) && processor.equals(l.processor) &&
                ramGB == l.ramGB && storageGB == l.storageGB &&
                hasGraphicsCard == l.hasGraphicsCard &&
                screenSize == l.screenSize && osType == l.osType &&
                serialNumber == l.serialNumber;
    }
}
