package com.example.RunFile.service;

import java.util.Collection;

import com.example.RunFile.dto.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}