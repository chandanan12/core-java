package com.xworkz.object.runner;

import com.xworkz.object.internal.Car;
import com.xworkz.object.internal.Laptop;
import com.xworkz.object.internal.Watch;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car);
        Car c1 = new Car("Tesla", "Model S", 2024, 8500000.0, true, 'E', 2.0f, 9876543210L);
        Car c2 = new Car("Tesla", "Model S", 2024, 8500000.0, true, 'E', 2.0f, 9876543210L);
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));

        System.out.println("===============================================");
        Laptop laptop=new Laptop();
        System.out.println(laptop);
        Laptop l1 = new Laptop("Dell", "Intel i7", 16, 512.0, true, 15.6f, 'W', 111223344L);
        Laptop l2 = new Laptop("Dell", "Intel i7", 16, 512.0, true, 15.6f, 'W', 111223344L);
        System.out.println(l2.toString());
        System.out.println(l1.equals(l2));

        System.out.println("==========================================");
        Watch watch=new Watch();
        System.out.println(watch);
        Watch w1 = new Watch("Apple", "Series 9", 2, 49999.0, true, 1.9f, 'S', 123456789L);
        Watch w2 = new Watch("Apple", "Series 9", 2, 49999.0, true, 1.9f, 'S', 123456789L);
        System.out.println(w2.toString());
        System.out.println(w1.equals(w2));

    }
}
