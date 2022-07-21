package com.javafsd.jwts.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.javafsd.jwts.service.UserService;
import com.javafsd.jwts.util.JwtUtility;

@Component
public class JwtFilter extends OncePerRequestFilter{

	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired
	private UserService UserService;

	private ServletResponse httpServletResponse;
	
	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authorization = httpServletRequest.getHeader("Authorization");
		String token = null;
		String userName = null;
		
		if(null!= authorization && authorization.startsWith("bearer")) {
			token = authorization.substring(7);
			userName = jwtUtility.getUsernameFromToken(token);
		}
		if (null!=userName && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails =UserService.loadUserByUsername(userName);
			
			if(jwtUtility.validateToken(token, userDetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
				= new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities()); 
			     
				usernamePasswordAuthenticationToken.setDetails(
						new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
			
			filterChain.doFilter(httpServletRequest, httpServletResponse);
			
		}
	}

}
