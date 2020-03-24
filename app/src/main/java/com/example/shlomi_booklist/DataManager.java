package com.example.shlomi_booklist;

import java.util.ArrayList;

public class DataManager {
    private static ArrayList<Book> bookArrayList = new ArrayList<>();

    public static ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public static void setBookArrayList(ArrayList<Book> bookArrayList) {
        DataManager.bookArrayList = bookArrayList;
    }

    public static void addBook(Book book){
        bookArrayList.add(book);
    }

    static Book getBookAt(int index){
        return bookArrayList.get(index);
    }
}
