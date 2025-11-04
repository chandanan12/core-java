package com.xworkz.specifer.external;

import com.xworkz.specifer.internal.Animal;

public class Dog extends Animal {
    public Dog(String dogName){
        super(dogName);
    }
    public void showDog(){
        System.out.println("Dog name from parent class:"+name);
    }
}
