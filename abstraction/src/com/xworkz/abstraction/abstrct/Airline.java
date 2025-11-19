package com.xworkz.abstraction.abstrct;

public abstract class Airline {
    public boolean isAvaliable;
    public Airline(boolean isAvaliable){
        this();
        this.isAvaliable=isAvaliable;
    }
     public Airline(){
     }
   public abstract void bookTicket();
   public abstract void cancelTicket();
   public abstract void checkIn();
   public abstract void boardFlight();
   public abstract void provideMeal();

   public static void showGuidelines(){

       System.out.println("all international should follow the guidelines");
   }
   public void baggageDetails(){

       System.out.println("for passenger have the limit of 25kg per baggage");
   }
public void customerHelpdesk(){

       System.out.println("Customer helpdesk available by 24/7");
   }
}



