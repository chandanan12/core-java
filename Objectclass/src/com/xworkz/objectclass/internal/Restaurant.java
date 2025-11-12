package com.xworkz.objectclass.internal;

public class Restaurant {
    public String name;
    public String cuisineType;
    public int seatingCapacity;
    public double rating;
    public boolean isOpen;

    public Restaurant() {
        System.out.println("Restaurant added");
    }

    public Restaurant(String name, String cuisineType, int seatingCapacity, double rating, boolean isOpen) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.seatingCapacity = seatingCapacity;
        this.rating = rating;
        this.isOpen = isOpen;
    }

    public String toString() {
        return "Restaurant{name=" + name + ", cuisineType=" + cuisineType + ", seatingCapacity=" + seatingCapacity +
                ", rating=" + rating + ", isOpen=" + isOpen + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant)) return false;
        Restaurant r = (Restaurant) obj;
        return name.equals(r.name) && cuisineType.equals(r.cuisineType) &&
                seatingCapacity == r.seatingCapacity && rating == r.rating && isOpen == r.isOpen;
    }
}