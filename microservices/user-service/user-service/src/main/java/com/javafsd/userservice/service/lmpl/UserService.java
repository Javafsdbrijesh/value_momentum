package com.javafsd.userservice.service.lmpl;
import java.util.List;


import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.error.UserNotFoundException;

 
public interface UserService {

    public User saveUser(User User);

    public List<User> getUsers();

    public User getUserById(Long UserId) throws UserNotFoundException;

    public User getUserByName(String name);

    public void deleteUserById(Long UserId);

    public User updateUser(User User, Long UserId);

}