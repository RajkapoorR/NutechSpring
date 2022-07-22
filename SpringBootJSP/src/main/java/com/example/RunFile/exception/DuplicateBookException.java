package com.example.RunFile.exception;

import com.example.RunFile.dto.Book;

import lombok.Getter;
@SuppressWarnings("serial")
@Getter


public class DuplicateBookException extends RuntimeException {
    @SuppressWarnings("unused")
	private final Book book;

    public Book getBook() {
		return book;
	}

	public DuplicateBookException(Book book) {
        this.book = book;
    }
    
}
