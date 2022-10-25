package edu.maltepe.oop;

public class Book {

    private String bookname;

    public Book(String name){
        this.bookname = name;
        Book book1 = new Book("OOP");
    }
}
