package com.example.practice2.services;

import com.example.practice2.models.Books;
import com.example.practice2.models.LanguageBooks;
import org.springframework.http.HttpStatus;

public interface LanguageService {

    public Iterable<LanguageBooks> listLanguageBooks();
    public LanguageBooks createLanguageBookPost(Books newBook);
    public HttpStatus deleteById(Long bookId);
}
