package com.xworkz.singleinheritance.internal;

public class BankAccount {
    private double balance;

    private BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    private void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.showBalance();
    }
}
