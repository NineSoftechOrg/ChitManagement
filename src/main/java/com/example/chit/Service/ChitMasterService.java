package com.example.chit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chit.Entity.ChitMaster;
import com.example.chit.Interface.ChitMasterimpl;
import com.example.chit.Repository.ChitMasterRepository;
import com.example.chit.Repository.UserRepository;

@Service
public class ChitMasterService  implements ChitMasterimpl{
	
	@Autowired
	public  ChitMasterRepository ChitMasterRepository;
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public ChitMaster save(ChitMaster chitMaster) {
		
		
		
		return ChitMasterRepository.save(chitMaster);
	}

}
