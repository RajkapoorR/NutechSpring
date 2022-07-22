package com.example.RunFile.Repository.impl;
import java.util.*;

import com.example.RunFile.Repository.BookRepository;
import com.example.RunFile.Repository.model.BookData;



public class InMemoryBookRepository implements BookRepository {

    private final Map<String, BookData> storedBooks;

    public InMemoryBookRepository(Map<String, BookData> storedBooks) {
        this.storedBooks = new HashMap<>();
        this.storedBooks.putAll(storedBooks);
    }

    @Override
    public Collection<BookData> findAll() {
        if (storedBooks.isEmpty()) {
            return Collections.emptyList();
        }

        return storedBooks.values();
    }

    @Override
    public Optional<BookData> findById(String isbn) {
        return Optional.ofNullable(storedBooks.get(isbn));
    }

    @Override
    public BookData add(BookData book) {
        storedBooks.put(book.getIsbn(), book);
        return book;
    }
}