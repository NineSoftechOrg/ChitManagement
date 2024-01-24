package com.example.chit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chit.Entity.Payments;
import com.example.chit.Interface.PaymentsImpl;
import com.example.chit.Repository.PaymentsRepository;

@Service
public class PaymentsService  implements PaymentsImpl{
	
	
	@Autowired
	public PaymentsRepository paymentsRepository;

	@Override
	public Payments save(Payments request) {
	
		return paymentsRepository.save(request); 
	}

	@Override
	public Payments update(Payments payments) {
		
		Payments ps = paymentsRepository.findByChitMasterIdAndUserIdAndChitItemsId(payments.getChitMasterId(),payments.getUserId(),payments.getChitItemsId());
		
		ps.setPaymentStatus(true);
		
	
		
		return paymentsRepository.save(ps);
	}
	

	@Override
	public List<Payments> getUsersByChitItemsId(String id) {
	
		return paymentsRepository.findByChitItemsId(Long.valueOf(id));
	}

}
