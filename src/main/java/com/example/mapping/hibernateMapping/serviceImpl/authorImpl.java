package com.example.mapping.hibernateMapping.serviceImpl;

import com.example.mapping.hibernateMapping.entity.Author;
import com.example.mapping.hibernateMapping.entity.Book;

import java.util.List;
import java.util.Optional;

public interface authorImpl {
    Author saveAuthor(Author author);
    List<Author> getAuthors();
    Optional<Author> getAuthorById(int id);
    String deleteAuthor(int id);
    Author updateAuthor(Author author);
}
