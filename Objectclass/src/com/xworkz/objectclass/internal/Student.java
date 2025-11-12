package com.xworkz.objectclass.internal;

public class Student {
    public String name;
    public int rollNumber;
    public double marks;
    public char grade;
    public boolean isPassed;

    public Student() {
        System.out.println("Student data added");
    }

    public Student(String name, int rollNumber, double marks, char grade, boolean isPassed) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = grade;
        this.isPassed = isPassed;
    }

    public String toString() {
        return "Student{name=" + name + ", rollNumber=" + rollNumber +
                ", marks=" + marks + ", grade=" + grade + ", isPassed=" + isPassed + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return name.equals(s.name) && rollNumber == s.rollNumber &&
                marks == s.marks && grade == s.grade && isPassed == s.isPassed;
    }
}