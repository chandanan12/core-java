package com.xworkz.objectclass.internal;

public class Airplane {
    public String airlineName;
    public int flightNumber;
    public double ticketPrice;
    public boolean isInternational;
    public float duration;

    public Airplane() {
        System.out.println("Airplane object created");
    }

    public Airplane(String airlineName, int flightNumber, double ticketPrice, boolean isInternational, float duration) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.ticketPrice = ticketPrice;
        this.isInternational = isInternational;
        this.duration = duration;
    }

    public String toString() {
        return "Airplane{airlineName=" + airlineName + ", flightNumber=" + flightNumber + ", ticketPrice=" + ticketPrice +
                ", isInternational=" + isInternational + ", duration=" + duration + " hours}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Airplane)) return false;
        Airplane a = (Airplane) obj;
        return airlineName.equals(a.airlineName) &&  flightNumber == a.flightNumber &&
                ticketPrice == a.ticketPrice && isInternational == a.isInternational && duration == a.duration;

    }
}
