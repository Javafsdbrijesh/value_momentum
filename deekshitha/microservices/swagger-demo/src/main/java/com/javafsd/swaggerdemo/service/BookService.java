package com.javafsd.swaggerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.javafsd.Swaggerdemo.entity.Book;
import com.javafsd.Swaggerdemo.repository.BookRepository;

@Service
public class BookService {
 
	@Autowired
	private BookRepository bookrepository;
	
	public Book saveBook(Book book) {
		Book booksave = bookrepository.save(book);
		        return booksave;
	}
	@GetMapping("/book/")
	public Book getAllBooks() {
		Book bookDb= (Book) bookrepository.findAll();
		return bookDb;
	}
}