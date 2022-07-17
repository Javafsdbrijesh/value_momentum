package com.javafsd.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.javafsd.userservice.entity.User;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByfirstName(String name);

    User findBylastName(String name);
 

	
 
}