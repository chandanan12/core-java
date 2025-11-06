package com.xworkz.object.runner;

import com.xworkz.object.internal.Book;

public class Run {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling", 350);
        b.showDetails();
    }
}
