package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.external.Dog;

public class Main  {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("Breed: " + d.breed);
    }
}