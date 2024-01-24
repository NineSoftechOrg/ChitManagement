package com.example.chit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chit.Entity.SuperAdmin;
import com.example.chit.Interface.SuperAdminImpl;
import com.example.chit.Repository.SuperAdminRepository;

@Service
public class SuperAdminService implements SuperAdminImpl {

	@Autowired
	public SuperAdminRepository superAdminRepository;  
	
	@Override
	public SuperAdmin save(SuperAdmin superAdmin) {
		
		return superAdminRepository.save(superAdmin);
	}

	@Override
	public SuperAdmin update(SuperAdmin superAdmin) {
		
		SuperAdmin sa = superAdminRepository.findByChitMasterIdAndUserIdAndLocalAdminId(superAdmin.getChitMasterId(),superAdmin.getUserId(),superAdmin.getLocalAdminId());
		
		return superAdminRepository.save(sa);
	}

}
