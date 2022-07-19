package com.javafsd.UserService.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseTemplateView getUserById(@PathVariable("id") Long userId) {
		LOGGER.info("Inside getUserById using RestTemplate");
		ResponseTemplateView responseTemplateView = userService.getUserById(userId);
		return responseTemplateView;		
	}
	
	@GetMapping("/")
	public List<DepartmentView> getAllDepartments(){
		return departmentClient.findDepartments();
	}
	
}