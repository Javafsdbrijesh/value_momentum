package com.javafsd.userservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javafsd.userservice.entity.User;

import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.service.Impl.UserService;
import com.javafsd.userservice.vo.DepartmentView;
import com.javafsd.userservice.vo.ResponseTemplateView;


@Service
public class UserServiceImpl implements UserService {

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
        public ResponseTemplateView getUserById(Long userId) {
            User userRespFromDB = userRepository.findById(userId).get();
            DepartmentView departmentView = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ userRespFromDB.getDepartmentId(), DepartmentView.class);


            ResponseTemplateView responseTemplateView = new ResponseTemplateView();
            responseTemplateView.setUser(userRespFromDB);
            responseTemplateView.setDepartmentView(departmentView);

            return responseTemplateView;
        }

   

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);

    }

    @Override
    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

	@Override
	public User getUserByName(String name) {
		User user = userRepository.findByfirstName(name);
        return user;
	}
	
}