package com.example.practice2.services;

import com.example.practice2.models.LanguageBooks;
import com.example.practice2.repositories.BookRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LanguageBooksImpl implements LanguageService {

    @Autowired
    LanguageRepositories languageRepositories;

    @Override
    public Iterable<LanguageBooks> listLanguageBooks() {
        return languageRepositories.findAll();
    }

    @Override
    public LanguageBooks createLanguageBooks(LanguageBooks languageBooks){
        return languageRepositories.save(languageBooks);
    }
    @Override
    public HttpStatus deleteLanguageBooksById(Long id) {
        languageRepositories.deleteById(id);
        return HttpStatus.OK;
    }
}
