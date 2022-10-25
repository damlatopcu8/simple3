package edu.maltepe.oop;

public class Prof {
    public String profname;

    public Prof(String name){
        this.profname = name;
    }

    public void read(Book book1){
        System.out.println(profname+ " read " + book1.bookname + ".");
    }
}
