package com.example.mapping.hibernateMapping.repository;

import com.example.mapping.hibernateMapping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepo extends JpaRepository<Book,Integer> {
}
