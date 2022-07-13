package com.javafsd.userservice.service.Impl;

import java.util.List;


import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.vo.ResponseTemplateView;

 
public interface UserService {

    public User saveUser(User User);

    public List<User> getUsers();

    

    public User getUserByName(String name);

    public void deleteUserById(Long UserId);


    public ResponseTemplateView getUserById(Long userId);
}