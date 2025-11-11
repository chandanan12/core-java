package com.xworkz.objectclass.internal;

public class Teacher {
    public String name;
    public String subject;
    public int experience;
    public double salary;
    public boolean isClassTeacher;

    public Teacher() {
        System.out.println("Teacher record added");
    }

    public Teacher(String name, String subject, int experience, double salary, boolean isClassTeacher) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        this.salary = salary;
        this.isClassTeacher = isClassTeacher;
    }

    public String toString() {
        return "Teacher{name=" + name + ", subject=" + subject + ", experience=" + experience +
                ", salary=" + salary + ", isClassTeacher=" + isClassTeacher + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher t = (Teacher) obj;
        return name.equals(t.name) && subject.equals(t.subject) &&
                experience == t.experience && salary == t.salary &&
                isClassTeacher == t.isClassTeacher;
    }
}