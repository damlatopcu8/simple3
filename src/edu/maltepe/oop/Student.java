package edu.maltepe.oop;

public class Student {
    private String studentname;

    public Student(String name){
        this.studentname = name;
    }

    public void read(Book book1){
        System.out.println(studentname + " read " + book1.bookname + ".");
    }
}
