package com.javafsd.userservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;

@Service

public class Userservice {
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		User userResponse = userRepository.save(user);
		return userResponse;
		

	}

}
