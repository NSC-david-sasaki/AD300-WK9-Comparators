package org.example;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o2.getYearPublished(), o1.getYearPublished());
    }
}
