package com.spring.helloworld;

public class HelloBean {
	private String firstname;	
	private int age;
	private String email;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void sayHello() {
		System.out.println("Hello my name is : "+this.firstname+"My email is :"+this.email + "My age is :"+this.age);
	}
}