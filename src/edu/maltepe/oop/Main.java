package edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {

            Prof prof1 = new Prof("Ensar Gül");
            Student student1 = new Student("Damlanur Topcu");
            Book book1 = new Book("OOP book");

            prof1.read(book1);
            student1.read(book1);
        }
    }
