package com.javafsd.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userServices;

    @PostMapping("/")
    public User saveDepartment(@RequestBody User user) {
        User userResponse = userServices.saveUser(user);
        return userResponse;
    }

}