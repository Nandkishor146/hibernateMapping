package com.example.mapping.hibernateMapping.service;

import com.example.mapping.hibernateMapping.entity.Author;
import com.example.mapping.hibernateMapping.serviceImpl.authorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapping.hibernateMapping.repository.authorRepo;

import java.util.List;
import java.util.Optional;

@Service
public class authorService implements authorImpl {
    @Autowired
    private authorRepo repo;
    @Override
    public Author saveAuthor(Author author) {
        return repo.save(author);
    }

    @Override
    public List<Author> getAuthors() {
        return repo.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(int id) {
        return repo.findById(id);
    }

    @Override
    public String deleteAuthor(int id) {
        repo.deleteById(id);
        return "Author Deleted";
    }

    @Override
    public Author updateAuthor(Author author) {
       Author previousAuthor=repo.findById(author.getAuthorId()).orElse(null);
       previousAuthor.setFirstName(author.getFirstName());
       previousAuthor.setLastName(author.getLastName());
       previousAuthor.setLangauge(author.getLangauge());
       return repo.save(previousAuthor);
    }
}
