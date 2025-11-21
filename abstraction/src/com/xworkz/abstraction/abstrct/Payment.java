package com.xworkz.abstraction.abstrct;

public abstract class Payment {
    double transactionLimit;
    public Payment(double transactionLimit){
        this();
        this.transactionLimit=transactionLimit;
    }
public Payment(){

}
    public abstract void makePayment();

    public abstract void refund();

    public abstract void verifyTransaction();

    public abstract void generateReceipt();

    public abstract void checkBalance();

    public static void paymentRules() {

        System.out.println("All payments must follow RBI security guidelines.");
    }

    public void customerSupport() {
        System.out.println("Customer support available 24/7.");
    }

    public void transactionLimit() {
        System.out.println("Daily transaction limit: ₹1,00,000.");

    }
}




