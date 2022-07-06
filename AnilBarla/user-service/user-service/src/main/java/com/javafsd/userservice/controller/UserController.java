package com.javafsd.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.impl.UserService;
import com.javafsd.userservice.service.Userservice;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		User userResponse=userService.saveUser(user);
		return userResponse;
	}
	   @GetMapping("/")
	    public List<User> findUsers(){
	        List<User> userList = userService.getUsers();
	        return userList;
	    }
	    
		@GetMapping("/{id}")
		public User getuserById(@PathVariable("id") Long userId) {
			User userResp = userService.getUserById(userId);
			return userResp;
			
		}
		
		 @DeleteMapping("/{id}")
		    public String deleteUserById(@PathVariable("id") Long userId) {
		        userService.deleteUserById(userId);
		        return "User deleted successfully for User Id" + userId;
		    }
	
 
	}

