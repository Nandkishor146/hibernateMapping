package com.example.mapping.hibernateMapping.controller;

import com.example.mapping.hibernateMapping.entity.Book;
import com.example.mapping.hibernateMapping.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private bookService service;
@PostMapping("/addBook")
    public Book addBook(@RequestBody Book book)
    {
        return service.saveBook(book);
    }
    @GetMapping("/getBooks")
    public List<Book> getBooKs()
    {
        return service.getAllBooks();
    }
    @DeleteMapping("/deleteBookById/{id}")
    public String deleteBookById(@PathVariable int id)
    {
     return service.deleteBook(id);
    }
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book)
    {
        return service.updateBook(book);
    }
}
