package com.spring.helloworld;

public class Hello {
	private String name;
	private int age;
	private String email;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void firstProgram() {
		System.out.println("Name: "+this.name  );
		System.out.println("Age: "+this.age);
		System.out.println("email: "+this.email);
	}
	

}
