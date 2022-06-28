// Assignment 36


package ak.spring.details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	private static ApplicationContext context;
	
	public static void main(String[] args) 
	{
		context = new ClassPathXmlApplicationContext("details.xml");
		
		EmpDetails empDetails = (EmpDetails) context.getBean("EmpDetails");
		empDetails.sayHello();
	}
}
