package javafsd.valuemomentum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValuemomentumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValuemomentumApplication.class, args);
	}
	@GetMapping ("/hello")
	public String helloworld()
	{
		return "Hello Spring boot";
	}
}
