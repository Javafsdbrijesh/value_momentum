package com.javafsd.Swaggerdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
   @Id
	private static final String GenerationType = null;

	private Long id;
	private String bookName;
	private String isbon;
	
}