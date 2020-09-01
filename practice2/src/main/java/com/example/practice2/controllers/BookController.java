package com.example.practice2.controllers;

import com.example.practice2.models.Books;
import com.example.practice2.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // cors sends and posts to other
@RequestMapping("/book")

public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public Iterable<Books> listBook() {
        return bookService.listBooks();
    }

    @PostMapping("/sellBook")
    public Books createPostBook(@RequestBody Books newBook) {
        return bookService.createBookPost(newBook);
    }

    @DeleteMapping("/{bookId}")
    public HttpStatus deleteBookbyId(@PathVariable Long bookId) {
        return bookService.deleteById(bookId);

    }

}
