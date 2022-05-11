package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.entity.User;
import com.zensar.repository.OlxLoginRepository;


@Service
public class OlxLoginServiceImpl implements OlxLoginService {
	
static List<User> users=new ArrayList<User>();

    @Autowired
    private OlxLoginRepository olxloginRepository;
	
	/* static {
		users.add(new User(1L, "Anand", "Kulkarni", "anand", "anand123", "anand@gmail.com", 12345));
		
	} */

	@Override
	public List<User> getAllUsers(String username, String password) {
		if(username.equals("anand")&&password.equals("anand123")) {
		//	return users;
			return olxloginRepository.findAll();
			}
		//return users;
	   return	null;
	}

	@Override
	public User registerUser(User user) {
           // users.add(user);
		return olxloginRepository.save(user);
		
		// return user;
	}

	@Override
	public boolean logoutUser(long id1, String username, String password) {

		if(username.equals("anand")&&password.equals("anand123")) {
		/*	for(User user:users) {
				if(user.getId()==id1) {
				//	users.remove(user); 
					
				
					return true;
				}
				
			} */
			olxloginRepository.deleteById(id1);
			return true;
			
		}
		return false;
	}

	@Override
	public String loginUser(User user) {
		// return user.getUserName()+"\n"+user.getPassword();
		return olxloginRepository.toString();
	}

}
