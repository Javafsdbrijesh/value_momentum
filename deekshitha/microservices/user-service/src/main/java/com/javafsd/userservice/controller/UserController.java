package com.javafsd.userservice.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.feign.DepartmentClient;
import com.javafsd.userservice.service.Impl.UserService;
import com.javafsd.userservice.vo.DepartmentView;
import com.javafsd.userservice.vo.ResponseTemplateView;


@RestController
@RequestMapping("/user")
public class UserController {
	 private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    public DepartmentClient departmentClient;
    @GetMapping("/")
    public List<DepartmentView> getAllDepartments(){
        return departmentClient.findDepartments();
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        User userResponse=userService.saveUser(user);
        return userResponse;
    }
       @GetMapping("//")
        public List<User> findUsers(){
            List<User> userList = userService.getUsers();
            return userList;
        }

        @GetMapping("/{id}")
        public ResponseTemplateView getuserById(@PathVariable("id") Long userId) {
        	LOGGER.info("Inside getUserId using RestTemplate");
            ResponseTemplateView responseTemplateView = userService.getUserById(userId);
            return responseTemplateView;

        }

         @DeleteMapping("/{id}")
            public String deleteUserById(@PathVariable("id") Long userId) {
                userService.deleteUserById(userId);
                return "User deleted successfully for User Id" + userId;
            }


    }