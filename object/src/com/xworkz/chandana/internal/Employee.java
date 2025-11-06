package com.xworkz.chandana.internal;

public class Employee {
        int empId;
        String empName;
        float salary;

       public Employee(int empId, String empName, float salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
        }

        public void display() {
            System.out.println("Employee ID: " + this.empId);
            System.out.println("Employee Name: " + this.empName);
            System.out.println("Salary: " + this.salary);
        }
    }

