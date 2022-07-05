package com.javafsd.userservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;
import com.javafsd.userservice.service.Impl.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        User userResponse = userService.saveUser(user);
        return userResponse;
    }

    @GetMapping("/")
    public List<User> findUser(){
        List<User> userList = userService.getUsers();
        return userList;
    }

    @GetMapping("/{id}")
    public User fetchUserById(@PathVariable("id") Long userId) throws UserNotFoundException{
        User user = userService.getUserById(userId);
        return user;
    }
        @GetMapping("/name/{name}")
        public User fetchUserById(@PathVariable("name") String user_Name) {
            User user = userService.getUserByName(user_Name);
            return user;
    }
        @DeleteMapping("/{id}")
        public String deleteUsertById(@PathVariable("id") Long userId) {
            userService.deleteUserById(userId);
            return "user deleted successfully for user id"+ userId;

        }
        @PutMapping("/{id}")
        public User updateUser(@PathVariable("id") Long userId,@RequestBody User user) {
            User user1 = userService.updateUser(user, userId);
            return user1;
        }
}