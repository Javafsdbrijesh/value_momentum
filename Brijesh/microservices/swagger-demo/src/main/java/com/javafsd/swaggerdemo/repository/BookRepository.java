package com.javafsd.swaggerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.swaggerdemo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
