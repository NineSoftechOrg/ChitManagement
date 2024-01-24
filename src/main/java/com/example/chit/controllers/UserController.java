package com.example.chit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.Payload;
import com.example.chit.Entity.User;
import com.example.chit.Interface.UserImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserImpl userImpl;
	
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		
		return  userImpl.save(user);	
		
	}
	
	
	@PostMapping("/delete")
	public void deleteUser(@RequestBody Payload payload) {
		
		Long uid=payload.getUid();
		
		userImpl.deleteUser(uid);
	}

}
