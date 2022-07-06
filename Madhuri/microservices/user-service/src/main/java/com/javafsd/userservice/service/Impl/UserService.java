package com.javafsd.userservice.service.Impl;

import org.springframework.stereotype.Component;

import com.javafsd.userservice.entity.User;

@Component
public interface UserService {

	public User saveUser(User user);

	public User getUserbyId(Long userId);


	
	

}