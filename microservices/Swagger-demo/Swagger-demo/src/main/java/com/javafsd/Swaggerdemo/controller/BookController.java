package com.javafsd.Swaggerdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.Swaggerdemo.entity.Book;
import com.javafsd.Swaggerdemo.service.BookService;

@RestController
public class BookController {
	
	private BookService bookService;
	
	@PostMapping("/book/")
	public Book saveBook(@RequestBody Book book) {
		Book bookRes = bookService.saveBook(book);
		return book;
	}
	@GetMapping("/book/")
	public Book getAllBooks() {
	Book bookRes = bookService.getAllBooks();
	return bookRes;
	}

}
