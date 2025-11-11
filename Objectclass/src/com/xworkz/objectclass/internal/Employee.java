package com.xworkz.objectclass.internal;

public class Employee {
    public String name;
    public int id;
    public double salary;
    public String department;
    public boolean isPermanent;

    public Employee() {
        System.out.println("Employee record created");
    }

    public Employee(String name, int id, double salary, String department, boolean isPermanent) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.isPermanent = isPermanent;
    }

    public String toString() {
        return "Employee{name=" + name + ", id=" + id + ", salary=" + salary +
                ", department=" + department + ", isPermanent=" + isPermanent + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return name.equals(e.name) && id == e.id &&
                salary == e.salary && department.equals(e.department) &&
                isPermanent == e.isPermanent;
    }
}