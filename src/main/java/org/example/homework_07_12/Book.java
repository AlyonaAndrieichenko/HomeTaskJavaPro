package org.example.homework_07_12;

import lombok.*;

@Getter
@Setter
@ToString

public class Book {
    private String author;
    private String name;
    private int issueYear;
    private Condition condition;
    private boolean isEBook;

    public Book(String author, String name, int issueYear, Condition condition, boolean isEBook){
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBook = isEBook;
    }

}
