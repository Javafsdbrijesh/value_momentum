package com.javafsd.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.feign.client.DepartmentClient;
import com.javafsd.userservice.service.UserService;
import com.javafsd.userservice.vo.DepartmentView;
import com.javafsd.userservice.vo.ResponseTempletView;

@RestController
@RequestMapping("/users")
public class UserController {



    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentClient departmentClient;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
    User userResp = userService.saveUser(user);
    return userResp;

    }
    @GetMapping("/{id}")
    public ResponseTempletView getuserById(@PathVariable("id") Long userId )
    {

        ResponseTempletView UserResp = userService.getUserById(userId);
        return UserResp;
    }
    @GetMapping("/")
    public List<DepartmentView> getAllDepartments() {
        return departmentClient.findDepartments();
    }
}
