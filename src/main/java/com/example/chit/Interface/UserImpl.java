package com.example.chit.Interface;

import com.example.chit.Entity.User;

public interface UserImpl {

	User save(User user);

	void deleteUser(Long uid);

}
