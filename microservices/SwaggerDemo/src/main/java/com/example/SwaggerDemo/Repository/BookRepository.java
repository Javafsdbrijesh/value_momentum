package com.example.SwaggerDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SwaggerDemo.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	

}