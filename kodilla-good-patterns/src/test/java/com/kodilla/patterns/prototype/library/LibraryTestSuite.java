package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        // Given
        Library library = new Library("City Library");
        Book book1 = new Book("Wiedźmin", "Andrzej Sapkowski", LocalDate.of(1993, 1, 1));
        Book book2 = new Book("Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));
        Book book3 = new Book("Duma i uprzedzenie", "Jane Austen", LocalDate.of(1813, 1, 28));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        // When
        Library shallowClonedLibrary = library.shallowCopy();
        shallowClonedLibrary.setName("City Library - shallow copy");


        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("City Library - deep copy");

        // Then
        System.out.println(library.getName() + ": " + library.getBooks());
        System.out.println(shallowClonedLibrary.getName() + ": " + shallowClonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName() + ": " + deepClonedLibrary.getBooks());

        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        Book book4 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1993, 1, 28));
        library.getBooks().add(book4);
        assertEquals(4, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}