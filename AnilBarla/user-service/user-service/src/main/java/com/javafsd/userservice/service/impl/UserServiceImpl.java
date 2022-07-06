package com.javafsd.userservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.impl.UserService;
import com.javafsd.userservice.repository.UserRepository;


@Service
public  class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User userResp = userRepository.save(user);
		return userResp;
	}

	@Override
	public User getUserById(Long userId) {
		 User userResp = userRepository.findById(userId).get();
		return userResp;
	}

	@Override
	public User getUserByFirstName(String name) {
		User user = userRepository.findByFirstName(name);
		return user;
	}

	@Override
	public User getUserByLastName(String name) {
		User user = userRepository.findByLastName(name);
		return user;
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
		
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = userRepository.findAll();
		return userList;
	}
	



}
