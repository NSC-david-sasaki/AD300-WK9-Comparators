package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1985);
    }

    @AfterEach
    void tearDown() {
        book = null;
        System.gc();
    }

    @Test
    void testToString() {
        assertEquals("Author: Douglas Adams - Title: Hitchhiker's Guide to the Galaxy - Year Published: 1985", book.toString());
    }

    @Test
    void compareTo() {
        assertEquals(0, book.compareTo(book));
    }

    @Test
    void compareToNull() {
        assertThrows(NullPointerException.class, () -> book.compareTo(null));
    }

    @Test
    void getAuthor() {
        assertEquals("Douglas Adams", book.getAuthor());
    }

    @Test
    void getYearPublished() {
        assertEquals(1985, book.getYearPublished());
    }

    @Test
    void yearPublishedNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Book Title", "Author Name", -1);
        });
    }

    @Test
    void yearPublishedInFuture() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Book Title", "Author Name", 2077);
        });
    }

    @Test
    void getTitle() {
        assertEquals("Hitchhiker's Guide to the Galaxy", book.getTitle());
    }
}