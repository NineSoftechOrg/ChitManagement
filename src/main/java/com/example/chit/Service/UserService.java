package com.example.chit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chit.Entity.User;
import com.example.chit.Interface.UserImpl;
import com.example.chit.Repository.UserRepository;

@Service
public class UserService  implements UserImpl{

	
	 @Autowired
      public UserRepository userRepository;

	@Override
	public User save(User user) {
	
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long uid) {
		userRepository.deleteById(uid);
		
	}
}
