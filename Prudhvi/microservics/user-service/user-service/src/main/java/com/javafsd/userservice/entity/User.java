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
    private String userFirstname;

    @Column(name = "user_lastname")
    private String userLastname;

    @Column(name = "email")
    private String Email;

    @Column(name = "contact")
    private long Contact;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userFirstname
	 */
	public String getUserFirstname() {
		return userFirstname;
	}

	/**
	 * @param userFirstname the userFirstname to set
	 */
	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	/**
	 * @return the userLastname
	 */
	public String getUserLastname() {
		return userLastname;
	}

	/**
	 * @param userLastname the userLastname to set
	 */
	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the contact
	 */
	public Long getContact() {
		return Contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(long contact) {
		Contact = contact;
	}

	public User(String userId, String userFirstname, String userLastname, String email, long contact) {
		super();
		this.userId = userId;
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		Email = email;
		Contact = contact;
	}

	public User() {
		
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstname=" + userFirstname + ", userLastname=" + userLastname
				+ ", Email=" + Email + ", Contact=" + Contact + "]";
	}

}


