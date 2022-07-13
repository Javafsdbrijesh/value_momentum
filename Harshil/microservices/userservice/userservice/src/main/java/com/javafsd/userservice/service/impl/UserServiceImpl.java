package com.javafsd.userservice.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.service.UserService;
import com.javafsd.userservice.vo.DepartmentView;
import com.javafsd.userservice.vo.ResponseTempletView;
@Service
public class UserServiceImpl implements UserService{
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
 public ResponseTempletView getUserById(Long userId) { 
User userRespFromDB = userRepository.findById(userId).get();
DepartmentView departmentView = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ userRespFromDB.getDepartmentId(), DepartmentView.class);
ResponseTempletView responseTempletView= new ResponseTempletView();
responseTempletView.setUser(userRespFromDB);       
responseTempletView.setDepartmentView(departmentView);
return responseTempletView;
}
}
