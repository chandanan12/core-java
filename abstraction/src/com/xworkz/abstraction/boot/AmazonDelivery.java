package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.DeliveryService;

public class AmazonDelivery extends DeliveryService {
    @Override
    public   void showDeliveryType()
    {
        System.out.println(" Prime with Delivery");
    }
    public AmazonDelivery(String name) {
        super(name);
    }

    public void acceptOrder(){
        System.out.println("Order accepted by Amazon."); }
   public void packItem() {
        System.out.println("Packing item in warehouse."); }
   public void dispatchOrder() {
        System.out.println("Order dispatched."); }
   public void trackOrder() {
        System.out.println("Tracking order via app."); }
   public void deliverOrder() {
        System.out.println("Order delivered to customer."); }
}



