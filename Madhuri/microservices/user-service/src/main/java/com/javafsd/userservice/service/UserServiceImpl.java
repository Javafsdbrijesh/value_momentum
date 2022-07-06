
package com.javafsd.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.service.UserServiceImpl;
import com.javafsd.userservice.service.Impl.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		User userResp= userRepository.save(user);
		return userResp;
		
	}

	@Override
	public User getUserbyId(Long userId )
	{
	     User userResp = userRepository.findById(userId).get();
		return userResp;
		
	}

	

}