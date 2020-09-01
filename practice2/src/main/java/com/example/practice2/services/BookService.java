package com.example.practice2.services;

import com.example.practice2.models.Books;
import org.springframework.http.HttpStatus;

public interface BookService {

    public Iterable<Books> listBooks();
    public Books createBookPost(Books newBook);
    public HttpStatus deleteById(Long bookId);
}
