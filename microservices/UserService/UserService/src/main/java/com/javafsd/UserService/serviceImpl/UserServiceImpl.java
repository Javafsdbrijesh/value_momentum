package com.javafsd.UserService.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javafsd.UserService.Vo.DepartmentView;
import com.javafsd.UserService.entity.User;
import com.javafsd.UserService.repository.UserRepository;
import com.javafsd.UserService.service.UserService;

@Service
public abstract class UserServiceImpl<ResponseTemplateView> implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		User userResp = userRepository.save(user);
		return userResp;
	}

	@Override
	public com.javafsd.UserService.service.ResponseTemplateView getUserById(Long userId) {
		//fetch user details from database based on user id 
		User userRespFromDB = userRepository.findById(userId).get();
		
		//Connecting to Department microservice using RestTemplate
		//fetch department details from department microservice using department id present in userRespFromDB as above.
		DepartmentView departmentView = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/"+ userRespFromDB.getDepartmentId(), DepartmentView.class);
		
		//Create object of ResponseTemplateView
		com.javafsd.UserService.service.ResponseTemplateView responseTemplateView = new com.javafsd.UserService.service.ResponseTemplateView();
		
		//set user details in ResponseTemplateView
		responseTemplateView.setUser(userRespFromDB);
		
		//set department details in ResponseTemplateView
		responseTemplateView.setDepartmentView(departmentView);
		
		return responseTemplateView;
	}

}