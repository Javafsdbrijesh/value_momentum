package com.javafsd.userservice.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;
import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		User userResponse=userServiceImpl.saveUser(user);
		return userResponse;
		
	}
	@GetMapping("/")
	public List<User> findUsers(){
		List<User> userList=userServiceImpl.getUsers();
		return userList;
	}
	@GetMapping("/{id}")
	 public User fetchDepartmentById(@PathVariable("id") Long userId) throws UserNotFoundException{
       LOGGER.info("Inside fetchDepartmentById method");
       User user = userServiceImpl.getUserById(userId);        
       LOGGER.info("Inside fetchDepartmentById method, Response : " + user);
       return user;
   }
	

}