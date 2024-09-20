package com.example.mapping.hibernateMapping.controller;

import com.example.mapping.hibernateMapping.entity.Author;
import com.example.mapping.hibernateMapping.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class authorController {
    @Autowired
    private authorService service;
@PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return service.saveAuthor(author);
    }
@GetMapping("/getAuthors")
    public List<Author> findAuthors() {
        return service.getAuthors();
    }
@GetMapping("/getAuthorById/{id}")
    public Optional<Author> findByID(@PathVariable int id) {
        return service.getAuthorById(id);
    }
@DeleteMapping("/deleteById/{id}")
    public String deleteAuthor(@PathVariable int id) {
        service.deleteAuthor(id);
        return "Author Deleted";
    }
@PutMapping("updateAuthor")
    public Author updateAuthor(@RequestBody Author author) {
        return service.updateAuthor(author);
    }
}
