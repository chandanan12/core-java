package com.xworkz.object.internal;

public class Book {
        String title;
        String author;
        int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public void showDetails() {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("Pages: " + this.pages);
    }
}
