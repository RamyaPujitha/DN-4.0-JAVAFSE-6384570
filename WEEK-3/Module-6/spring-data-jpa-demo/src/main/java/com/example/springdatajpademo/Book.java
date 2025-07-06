package com.example.springdatajpademo;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    // Constructors
    public Book() {}

    public Book(String title) {
        this.title = title;
    }

    // Getter
    public String getTitle() {
        return title;
    }
}
