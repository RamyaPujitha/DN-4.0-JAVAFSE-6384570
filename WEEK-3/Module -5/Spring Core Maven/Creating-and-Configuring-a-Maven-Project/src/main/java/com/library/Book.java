package com.library;

public class Book {
    private String title;

    public Book() {
        System.out.println("Book: no-arg constructor");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book Title: " + title);
    }
}
