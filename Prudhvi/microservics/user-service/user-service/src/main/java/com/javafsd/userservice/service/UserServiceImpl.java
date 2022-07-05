package com.javafsd.userservice.service;
import java.util.List;


import java.util.Objects;
import java.util.Optional;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;
import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.service.Impl.UserService;

 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired 
    private UserRepository UserRepository;
 
    private final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
 
    @Override
    public User saveUser(User User) {
        User UserResponse = UserRepository.save(User);
        LOGGER.info("User saved successfully in database");
        return UserResponse; 
    }
 
    @Override
    public List<User> getUsers() {
    	List<User> UserList = UserRepository.findAll();
        return UserList;
    }
 
    @Override
    public User getUserById(Long UserId) throws UserNotFoundException {
        Optional<User> User = UserRepository.findById(UserId);
        if(!User.isPresent()) {
            throw new UserNotFoundException("User not Available for User Id: " + UserId);
        }
        return User.get();
    }
 
    @Override
    public User getUserByName(String name) {
        User User = UserRepository.findByUserName(name);
        return User;
    }
 
    @Override
    public void deleteUserById(Long UserId) {
        UserRepository.deleteById(UserId);
    }
 
    @Override
    public User updateUser(User UserReq, Long UserId) {
        User UserDB = UserRepository.findById(UserId).get();
 
        if(Objects.nonNull(UserReq.getUserFirstname()) && 
                !"".equalsIgnoreCase(UserReq.getUserFirstname())){
            UserDB.setUserFirstname(UserReq.getUserFirstname());
            LOGGER.info("User firstName updates successfully");
        }
        if(Objects.nonNull(UserReq.getUserLastname()) && 
                !"".equalsIgnoreCase(UserReq.getUserLastname())) {
            UserDB.setUserLastname(UserReq.getUserLastname());
            LOGGER.info("User last updates successfully");
        }
        if(Objects.nonNull(UserReq.getEmail()) && 
                !"".equalsIgnoreCase(UserReq.getEmail())) {
            UserDB.setEmail(UserReq.getEmail());
            LOGGER.info("User  email updated successfully");
        }
        User dept = UserRepository.save(UserDB);
 
        return dept;
    }
}