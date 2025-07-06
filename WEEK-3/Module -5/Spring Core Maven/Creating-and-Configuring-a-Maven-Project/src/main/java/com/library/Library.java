package com.library;

public class Library {
    private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public void showLibrary() {
        System.out.println("Library contains:");
        book.display();
    }
}
