package com.xworkz.objectclass.runner;

import com.xworkz.objectclass.internal.*;

public class Main {
    public static void main(String[] args) {

        Student s= new Student();
        System.out.println(s);
        Student s1 = new Student("Ravi", 101, 88.5,'A' ,true);
        Student s2 = new Student("Ravi", 101, 88.5,'A' ,true);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println("===================");

        Employee e = new Employee();
        System.out.println(e);
        Employee e1 = new Employee("Anu", 1001,55000,"IT", true);
        Employee e2 = new Employee("Anu", 1001,55000,"IT", true);
        System.out.println(e2.toString());
        System.out.println(e1.equals(e2));
        System.out.println("===================");

        Product p = new Product();
        System.out.println(p);
        Product p1= new Product("Shoes", 301,5000, 1.5f, true);
        Product p2= new Product("Shoes", 301,5000, 1.5f, true);
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
        System.out.println("===================");

        Teacher t = new Teacher();
        System.out.println(t);
        Teacher t1 = new Teacher("Priya", "Maths", 8,45000, true);
        Teacher t2 = new Teacher("Priya", "Maths", 8,45000, true);
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));
        System.out.println("===================");

        Hospital h = new Hospital();
        System.out.println(h);
        Hospital h1 = new Hospital("Apollo", 300,4.5, false, "Chennai");
        Hospital h2 = new Hospital("Apollo", 300,4.5, false, "Chennai");
        System.out.println(h2.toString());
        System.out.println(h1.equals(h2));
        System.out.println("===================");

        Camera c = new Camera();
        System.out.println(c);
        Camera c1 = new Camera("Canon",24.2, true,3.0f,10);
        Camera c2 = new Camera("Canon",24.2, true,3.0f,10);
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println("===================");

        Restaurant r = new Restaurant();
        System.out.println(r);
        Restaurant r1 = new Restaurant("Spice Garden", "Indian",80, 4.2, true);
        Restaurant r2 = new Restaurant("Spice Garden", "Indian",80, 4.2, true);
        System.out.println(r2.toString());
        System.out.println(r1.equals(r2));
        System.out.println("===================");

        Airplane a = new Airplane();
        System.out.println(a);
        Airplane a1 = new Airplane("Air India", 250, 15000.75, true,7.5f);
        Airplane a2 = new Airplane("Air India", 250, 15000.75, true,7.5f);
        System.out.println(a2.toString());
        System.out.println(a1.equals(a2));
        System.out.println("===================");

        Game g = new Game();
        System.out.println(g);
        Game g1 = new Game("Cricket", "Sports", 30.5, true,10);
        Game g2 = new Game("Cricket", "Sports", 30.5, true,10);
        System.out.println(g2.toString());
        System.out.println(g1.equals(g2));
        System.out.println("===================");

        Movie m = new Movie();
        System.out.println(m);
        Movie m1 = new Movie("KGF", "Avatar 2", 9.5,180, true);
        Movie m2 = new Movie("KGF", "Avatar 2", 9.5,180, true);
        System.out.println(m2.toString());
        System.out.println(m1.equals(m2));
        System.out.println("===================");
    }
}
