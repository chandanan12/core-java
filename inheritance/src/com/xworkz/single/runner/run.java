package com.xworkz.single.runner;

import com.xworkz.inheritance.external.Dog;
import com.xworkz.inheritance.internal.Animal;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        // using Scanner (from specific import)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.println("Upcasting Example ---");
        Animal a = new Dog(); // upcasting
        a.sound(); // Calls overridden method from Dog

        System.out.println(" Downcasting Example ---");
        // downcasting
        Dog d = (Dog) a;
        d.fetch();

        System.out.println(" Inline Import Example ---");
        java.util.Date today = new java.util.Date(); // inline import (no import line)
        System.out.println("Today's date: " + today);

        sc.close();
    }
}
