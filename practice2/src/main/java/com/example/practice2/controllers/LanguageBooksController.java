package com.example.practice2.controllers;

import com.example.practice2.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.practice2.models.LanguageBooks;
import com.example.practice2.services.LanguageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // cors sends and posts to other
@RequestMapping("/languages")
public class LanguageBooksController {
    @Autowired
    private LanguageBooks languageBooks;

    @GetMapping("/languagelist")
    public Iterable<LanguageBooks> listLanguageBooks() { return LanguageService.listLanguages(); }

    @PostMapping("/sellLanguagebook")
    public LanguageBooks createPostLanguageBook(@RequestBody LanguageBooks newLanguageBook) {
        return languagebookService.createLanguageBookPost(newLangaugeBook);

        @DeleteMapping("/{languagebookId}")
        public HttpStatus deletelanguageBookbyId(@PathVariable Long languagebookId) {
            return languagebookService.deleteById(languagebookId);
    }

}
