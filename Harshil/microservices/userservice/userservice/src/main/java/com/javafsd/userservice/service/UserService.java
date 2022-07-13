package com.javafsd.userservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.vo.ResponseTempletView;

@Component
public interface UserService {

    public User saveUser(User user);

    public ResponseTempletView getUserById(Long userId);



}

