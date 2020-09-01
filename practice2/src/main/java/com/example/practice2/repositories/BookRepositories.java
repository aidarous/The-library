package com.example.practice2.repositories;

import com.example.practice2.models.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Books, Long> {
}
