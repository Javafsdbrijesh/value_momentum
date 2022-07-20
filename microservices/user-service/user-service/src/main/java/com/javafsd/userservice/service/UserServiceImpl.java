package com.javafsd.userservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;
import com.javafsd.userservice.impl.UserService;
import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	 private final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {
		User userResponse = userRepository.save(user);
		return userResponse;
	}
	
	@Override
	public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
	
	
	@Override
	public User getUserById(Long userId) throws UserNotFoundException {
	        Optional<User> user = userRepository.findById(userId);
	        if(!user.isPresent()) {
	            throw new UserNotFoundException("User not Available for User Id: " + userId);
	        }
	        return user.get();
	    }

	

}