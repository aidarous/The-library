package com.example.practice2.services;

import com.example.practice2.models.Books;
import com.example.practice2.repositories.BookRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public Iterable<Books> listBooks() {
        return bookRepositories.findAll();
    }

    @Override
    public Books createBookPost(Books newBook) {
        return bookRepositories.save(newBook);
    }

    @Override
    public HttpStatus deleteById(Long bookId) {
        bookRepositories.deleteById(bookId);
        return HttpStatus.OK;
    }

    @Autowired
    private BookRepositories bookRepositories;

}

