package com.xworkz.objectclass.internal;

public class Hospital {
    public String name;
    public int beds;
    public double rating;
    public boolean isGovernment;
    public String location;

    public Hospital() {
        System.out.println("Hospital created");
    }

    public Hospital(String name, int beds, double rating, boolean isGovernment, String location) {
        this.name = name;
        this.beds = beds;
        this.rating = rating;
        this.isGovernment = isGovernment;
        this.location = location;
    }

    public String toString() {
        return "Hospital{name=" + name + ", beds=" + beds + ", rating=" + rating +
                ", isGovernment=" + isGovernment + ", location=" + location + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Hospital)) return false;
        Hospital h = (Hospital) obj;
        return name.equals(h.name) && beds == h.beds &&
                rating == h.rating && isGovernment == h.isGovernment &&
                location.equals(h.location);
    }
}