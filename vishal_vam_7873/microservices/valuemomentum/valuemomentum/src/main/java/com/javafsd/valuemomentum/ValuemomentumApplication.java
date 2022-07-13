package com.javafsd.valuemomentum;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ValuemomentumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValuemomentumApplication.class, args);
	}
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello my name is ARVIND";
	}

}
