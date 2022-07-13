package com.javafsd.userservice.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;
import com.javafsd.userservice.repository.UserRepository;


public interface UserService {
	
	public User saveUser(User user);
	public List<User> getUsers();
	public User getUserById(Long userId) throws UserNotFoundException;


}