package com.xworkz.abstraction.abstrct;

public abstract class DeliveryService {
    String name;
    public DeliveryService(String name){
        this();
        this.name=name;
    }
    public DeliveryService(){

    }

  public   abstract void acceptOrder();
    public abstract void packItem();
   public abstract void dispatchOrder();
    public abstract void trackOrder();
   public abstract void deliverOrder();
    public void showCompanyName()
    {
        System.out.println("Company: Amazon Delivery Services");
    }

   public   void showDeliveryType()
   {
        System.out.println(" Prime Delivery");
    }
    public static void serviceArea()
    {
        System.out.println("Service Area: All over India");
    }

}

