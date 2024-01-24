package com.example.chit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chit.Entity.LocalAdmin;
import com.example.chit.Interface.LocalAdminImpl;
import com.example.chit.Repository.LocallAdminRepository;

@Service
public class LocalAdminService implements LocalAdminImpl {
	
	@Autowired
	public LocallAdminRepository locallAdminRepository;

	@Override
	public LocalAdmin save(LocalAdmin localAdmin) {
	
		return locallAdminRepository.save(localAdmin) ;
	}

	@Override
	public LocalAdmin update(LocalAdmin localAdmin) {
		
		LocalAdmin la = locallAdminRepository.findByUserIdAndChitMasterIdAndPaymentsIdAndChitItemsIdAndItemUsersId(localAdmin.getUserId(), localAdmin.getChitMasterId(),localAdmin.getPaymentsId(), localAdmin.getChitItemsId(),localAdmin.getItemUsersId());
		
		
		
		return locallAdminRepository.save(la);
	}

}
