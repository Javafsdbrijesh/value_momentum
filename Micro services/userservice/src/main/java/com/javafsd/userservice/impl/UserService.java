package com.javafsd.userservice.impl;

import java.util.List;    

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;


public interface UserService 
{
    public User saveUser(User user);
    public List<User> getUsers();
    public User getUserById(Long userId) throws UserNotFoundException;
}