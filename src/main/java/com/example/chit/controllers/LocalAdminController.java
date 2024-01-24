package com.example.chit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.LocalAdmin;

import com.example.chit.Interface.LocalAdminImpl;


@RestController
@RequestMapping("/local")
public class LocalAdminController{
	
	@Autowired
	public LocalAdminImpl localAdminImpl;
	
	
	
	
	@PostMapping("/add")
	public LocalAdmin addUser(@RequestBody LocalAdmin localAdmin) {
		
		return  localAdminImpl.save(localAdmin);	
		
	}
	
	
	@PostMapping("/update")
	public LocalAdmin update(@RequestBody LocalAdmin localAdmin) {
		
		return localAdminImpl.update(localAdmin);
	}

}
