package com.example.mapping.hibernateMapping.service;

import com.example.mapping.hibernateMapping.entity.Book;
import com.example.mapping.hibernateMapping.serviceImpl.bookImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapping.hibernateMapping.repository.bookRepo;

import java.util.List;
import java.util.Optional;

@Service
public class bookService implements bookImpl {
    @Autowired
    private bookRepo repo;
    @Override
    public Book saveBook(Book book) {
        return repo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @Override
    public Optional<Book> getBookById(int id) {
        return repo.findById(id);
    }

    @Override
    public String deleteBook(int id) {
     repo.deleteById(id);
     return "book Deleted"+id;
    }

    @Override
    public Book updateBook(Book book) {
         Book previosBook=repo.findById(book.getId()).orElse(null);
         previosBook.setTitle(book.getTitle());
         previosBook.setAuthor(book.getAuthor());
        return repo.save(previosBook);
    }
}
