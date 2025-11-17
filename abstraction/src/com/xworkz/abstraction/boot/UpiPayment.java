package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstrct.Payment;

public class UpiPayment extends Payment {
    public   void makePayment() { System.out.println("Making UPI payment."); }
    public void refund() { System.out.println("Processing refund."); }
    public void verifyTransaction() { System.out.println("Verifying payment."); }
    public void generateReceipt() { System.out.println("Generating digital receipt."); }
    public void checkBalance() { System.out.println("Checking bank balance."); }
}
