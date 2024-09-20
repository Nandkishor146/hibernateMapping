package com.example.mapping.hibernateMapping.repository;

import com.example.mapping.hibernateMapping.entity.Author;
import com.example.mapping.hibernateMapping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface authorRepo extends JpaRepository<Author,Integer> {

}
