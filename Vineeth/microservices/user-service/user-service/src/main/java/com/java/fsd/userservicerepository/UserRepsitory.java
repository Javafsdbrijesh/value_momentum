package com.java.fsd.userservicerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	

}