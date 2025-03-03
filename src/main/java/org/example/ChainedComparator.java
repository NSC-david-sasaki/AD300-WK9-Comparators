package org.example;

import java.util.Comparator;

public class ChainedComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorComparison = b1.getAuthor().compareTo(b2.getAuthor());

        if (authorComparison != 0) {
            return authorComparison;
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
