package com.example.shlomi_booklist;

public class Book {
    private String bookName, author, genre;

    public Book(String bookName, String author, String genre) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }
}
