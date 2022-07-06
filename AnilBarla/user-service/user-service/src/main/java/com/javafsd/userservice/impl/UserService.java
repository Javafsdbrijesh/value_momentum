package com.javafsd.userservice.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.javafsd.userservice.entity.User;

@Component
public interface UserService {
	
	public User saveUser(User user);
	public User getUserById(Long userId);
	public User getUserByFirstName(String name);
	public User getUserByLastName(String name);
	void deleteUserById(Long userId);
	public List<User> getUsers();

}
