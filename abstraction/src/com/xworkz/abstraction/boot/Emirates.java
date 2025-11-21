package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Airline;

public class Emirates extends Airline {
    public Emirates(boolean isAvaliable) {
        super(isAvaliable);
    }
@Override
public void baggageDetails(){

    System.out.println("passenger have the limit of 25kg per baggage");
}
    public void bookTicket() {
        System.out.println("Booking Emirates flight."); }
    public void cancelTicket() {
        System.out.println("Cancelling ticket."); }
    public void checkIn() {
        System.out.println("Online check-in completed."); }
    public void boardFlight() {
        System.out.println("Boarding gate 22."); }
    public void provideMeal() {
        System.out.println("Serving inflight meal."); }
}