package com.javafsd.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_generator")
	@SequenceGenerator(name="user_generator", sequenceName="user_seq", allocationSize=50)
	@Column(name="user_id", updatable=false, nullable=false)
	private long userId;
	
	@Column(name="user_firstname")
	private String firstName;
	
	@Column(name="user_lastname")
	private String lastName;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_contact")
	private long contact;
	
	@Column(name="department_id")
	private long departmentId;
	



	public User() {
	
	}



	public User(long userId, String firstName, String lastName, String email, long contact, long departmentId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.departmentId = departmentId;
	}

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + ", departmentId=" + departmentId + "]";
	}
	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	
	

}