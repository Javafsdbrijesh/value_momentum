package com.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment36 {
	private static ApplicationContext hello;
	public static void main(String[] args) {
		hello = new ClassPathXmlApplicationContext("beans.xml"); 
		Hello a1 = (Hello) hello.getBean("Hello");
		a1.firstProgram();
	}
	

}
