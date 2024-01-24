package com.example.chit.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.SuperAdmin;

import com.example.chit.Interface.SuperAdminImpl;


@RestController
@RequestMapping("/super")
public class SuperAdminController {
	
	
	@Autowired
	public SuperAdminImpl superAdminImpl;
	
	
	@PostMapping("/add")
	public SuperAdmin addUser(@RequestBody SuperAdmin superAdmin) {
		
		return  superAdminImpl.save(superAdmin);	
		
	}
	
	@PostMapping("/update")
	public SuperAdmin updatePayments(@RequestBody SuperAdmin superAdmin) {
		
		return  superAdminImpl.update(superAdmin);
	}
}


