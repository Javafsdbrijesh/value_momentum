package com.javafsd.swaggerdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Book {
    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String isbn;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(Long id, String bookName, String isbn) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", isbn=" + isbn + "]";
	}

}