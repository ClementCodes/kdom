package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {

	
	
	@Autowired
	private UserService userService;
	
	
	
	
	
	  @PostMapping({ "/registernewuser" })
	    public User registerNewUser(@RequestBody User user) {
	        return userService.savedUser(user);
	    }
	
	
	
	 /**
	    * Read - Get all User
	    * @return - An Iterable object of User full filled
	    */
	@GetMapping("/users")
	public Iterable<User>getUser(){
		
		return userService.getUser();
	}
}
