package com.javafsd.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.UserService.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}