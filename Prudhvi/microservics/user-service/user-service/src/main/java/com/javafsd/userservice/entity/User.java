package com.javafsd.userservice.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name ="User")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
    private String userId;
	
    @Column(name = "user_firstname")
    private String user_firstname;

    @Column(name = "user_lastname")
    private String user_lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private long contact;

}


