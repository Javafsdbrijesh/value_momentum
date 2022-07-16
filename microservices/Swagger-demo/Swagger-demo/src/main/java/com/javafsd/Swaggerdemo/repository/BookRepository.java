package com.javafsd.Swaggerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.Swaggerdemo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
