package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Android Internals: Implementor's View", "Jonathan Levin", 2022));
        books.add(new Book("Software Engineering at Google", "Winters, Manshreck, Wright", 2020));
        books.add(new Book("The Linux Programming Interface", "Michael Kerrisk", 2010));
        books.add(new Book("Building Java Proograms", "Reges & Stepp", 2017));

        System.out.println("Sorted by Title:");
        Collections.sort(books);
        books.forEach(System.out::println);

        System.out.println("\nSorted by Author:");
        books.sort(new AuthorComparator());
        books.forEach(System.out::println);

        System.out.println("\nSorted by Year:");
        books.sort(new YearComparator());
        books.forEach(System.out::println);

        System.out.println("\nSorted by Author then Title:");
        books.sort(new ChainedComparator());
        books.forEach(System.out::println);
    }
}