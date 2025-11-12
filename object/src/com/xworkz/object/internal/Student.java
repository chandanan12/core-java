package com.xworkz.object.internal;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

