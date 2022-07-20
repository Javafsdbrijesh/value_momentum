package com.javafsd.userservice.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
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
import com.javafsd.userservice.vo.ResponseTemplateView;



@RestController
@RequestMapping("/users")
public class UserController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
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
	public ResponseTemplateView getuserById(@PathVariable("id") Long userId) {
		LOGGER.info("Inside getuserById using RestTemplate");
		ResponseTemplateView UserResp = userService.getUserById(userId);
		return UserResp;
	}
	@GetMapping("/findAllDepartments")
	public List<DepartmentView> findDepartments(){
		return departmentClient.findDepartments();
	}

}