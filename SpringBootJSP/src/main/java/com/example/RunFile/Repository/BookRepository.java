package com.example.RunFile.Repository;

import java.util.Collection;
import java.util.Optional;
import com.example.RunFile.Repository.model.BookData;


public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}