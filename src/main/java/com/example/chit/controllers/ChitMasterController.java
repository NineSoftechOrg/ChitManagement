package com.example.chit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.ChitMaster;
import com.example.chit.Interface.ChitMasterimpl;

@RestController
@RequestMapping("/chitmaster")
public class ChitMasterController {
	
	@Autowired
	public ChitMasterimpl  chitMasterimpl;
	
	@PostMapping("/add")
	public ChitMaster add(@RequestBody ChitMaster  chitMaster ) {
		
		return chitMasterimpl.save(chitMaster);
	}

}
