
package com.example.chit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.ItemUsers;
import com.example.chit.Interface.ItemUserImpl;
import com.example.chit.payloads.UserPayload;

@RestController
@RequestMapping("/item_users")
public class ItemUserController {
	
	@Autowired
	public ItemUserImpl itemUserImpl;
	
	
	
	@PostMapping("/add")
	public ItemUsers add(@RequestBody UserPayload request) {
		
		
		
		return itemUserImpl.save(request);
	
	}
	
	@PostMapping("/update")
	public ItemUsers update(@RequestBody ItemUsers request) {
		
		return itemUserImpl.update(request);
	}
	
	@GetMapping("/getusers/{id}")
	public List<ItemUsers> getUsersByChitId(@PathVariable String id ){
		
		
		
		return itemUserImpl.getUsersByChitId(id);
	}

}
