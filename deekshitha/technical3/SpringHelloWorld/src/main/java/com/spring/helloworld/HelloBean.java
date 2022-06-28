package com.spring.helloworld;
 
public class HelloBean {
    private String firstName;
    private int age;
    private String email;

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
 
    
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void sayHello() {
        System.out.println("Hello my name is : "+ this.firstName + "  Age : "+this.age + " Email : " + this.email);
    }
}