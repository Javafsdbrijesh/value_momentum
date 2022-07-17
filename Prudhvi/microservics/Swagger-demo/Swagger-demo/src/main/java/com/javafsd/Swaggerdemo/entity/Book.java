package com.javafsd.Swaggerdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Book {
   @Id
    private static final String GenerationType = null;

    private Long id;
    private String bookName;
    private String isbon;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the isbon
	 */
	public String getIsbon() {
		return isbon;
	}
	/**
	 * @param isbon the isbon to set
	 */
	public void setIsbon(String isbon) {
		this.isbon = isbon;
	}
	/**
	 * @return the generationtype
	 */
	public static String getGenerationtype() {
		return GenerationType;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", isbon=" + isbon + "]";
	}
    

}