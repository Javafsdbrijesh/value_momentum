package com.javafsd.UserService.service;

import org.springframework.stereotype.Component;

import com.javafsd.UserService.entity.User;

@Component
public interface UserService {

	public User saveUser(User user);
	public ResponseTemplateView getUserById(Long userId);

}