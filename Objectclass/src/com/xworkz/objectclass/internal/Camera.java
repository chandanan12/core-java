package com.xworkz.objectclass.internal;

public class Camera {
    public String brand;
    public double resolution;
    public boolean isDSLR;
    public float screenSize;
    public int batteryLife;

    public Camera() {
        System.out.println("Camera object created");
    }

    public Camera(String brand, double resolution, boolean isDSLR, float screenSize, int batteryLife) {
        this.brand = brand;
        this.resolution = resolution;
        this.isDSLR = isDSLR;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public String toString() {
        return "Camera{brand=" + brand + ", resolution=" + resolution + ", isDSLR=" + isDSLR +
                ", screenSize=" + screenSize + ", batteryLife=" + batteryLife + " hours}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Camera)) return false;
        Camera c = (Camera) obj;
        return brand.equals(c.brand) && resolution == c.resolution &&
                isDSLR == c.isDSLR && screenSize == c.screenSize && batteryLife == c.batteryLife;
    }
}