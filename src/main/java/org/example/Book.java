package org.example;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }

        if (yearPublished < 0 || yearPublished > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of publication must be non-negative and cannot be in the future");
        }
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    @Override
    public String toString() {
        String sb = "Author: "+this.author +
                " - " +
                "Title: "+this.title +
                " - " +
                "Year Published: "+this.yearPublished;
        return sb;
    }

    @Override
    public int compareTo(Book o) {
        if(o != null) {
            return this.title.compareTo(o.title);
        }
        throw new NullPointerException();
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public String getTitle() {
        return this.title;
    }
}
