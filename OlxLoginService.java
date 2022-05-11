package com.zensar.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entity.User;

public interface OlxLoginService {
	
	List<User> getAllUsers(String username, String password);
	
	User registerUser( User user);
	
	boolean logoutUser( long id1, String username, String password);
	
	String loginUser(@RequestBody User user );



	
	

}
