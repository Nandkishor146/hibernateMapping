package com.example.mapping.hibernateMapping.serviceImpl;

import com.example.mapping.hibernateMapping.entity.Book;

import java.util.List;
import java.util.Optional;

public interface bookImpl {
Book saveBook(Book book);
List<Book> getAllBooks();
Optional<Book> getBookById(int id);
String deleteBook(int id);
Book updateBook(Book book);
}
