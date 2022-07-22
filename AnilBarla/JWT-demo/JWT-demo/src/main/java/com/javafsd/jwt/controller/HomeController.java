package com.javafsd.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.jwt.model.JwtRequest;
import com.javafsd.jwt.model.JwtResponse;
import com.javafsd.jwt.service.UserService;
import com.javafsd.jwt.util.JwtUtility;



@RestController
public class HomeController {
	
	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String hello() {
		return "Welcome to javaFSD Spring Security";
		
	}
	@PostMapping("/authenticate")
	public JwtResponse autenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
		try {
				authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
					jwtRequest.getUserName(),
					jwtRequest.getPassword()
					)
				);	
		} catch(BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIAL", e);
		
	}
		final UserDetails userDetails = userservice.loadUserByUsername(jwtRequest.getUserName());
		
		final String token = jwtUtility.generateToken(userDetails);
		
		return new JwtResponse(token);

	}
}