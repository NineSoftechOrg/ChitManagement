package com.example.chit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.ChitItems;

import com.example.chit.Interface.ChitItemsImpl;

@RestController
@RequestMapping("/chit_items")
public class ChitItemsController {
	
	@Autowired
	public ChitItemsImpl chitItemsImpl;
	
	@PostMapping("/add")
	public ChitItems add(@RequestBody ChitItems chitItems) {
		
		return chitItemsImpl.save(chitItems);
	}
	
	/*
	 * @GetMapping("/get") public ChitItems getAllUsersInChit(@RequestBody ChitItems
	 * chitItems) {
	 * 
	 * return chitItemsImpl.getAllUsersInChit(chitItems); }
	 */
	
	

}
