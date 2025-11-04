package com.xworkz.specifer.internal;

public class Animal {
    public String name;

    public Animal(String animalName) {
        name = animalName;
    }

    public void display() {
        System.out.println("Animal name:" + name);
    }
}
