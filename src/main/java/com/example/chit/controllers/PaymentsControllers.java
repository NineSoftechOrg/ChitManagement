package com.example.chit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chit.Entity.Payments;
import com.example.chit.Interface.PaymentsImpl;

@RestController
@RequestMapping("/payments")
public class PaymentsControllers {
	
	
	@Autowired
	public PaymentsImpl paymentsImpl;
	
	@PostMapping("/add")
	public Payments addPayments(@RequestBody Payments request) {
		
		return paymentsImpl.save(request);
	}
	
	@PostMapping("/update")
	public Payments updatePayments(@RequestBody Payments payments) {
		
		return paymentsImpl.update(payments);
	}
	
	@GetMapping("/getUsers/{id}")
	public List<Payments> getUsersByChitItemsId(@PathVariable String id){
		
		return paymentsImpl.getUsersByChitItemsId(id);
	}

}
