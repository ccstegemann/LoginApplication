package com.loginApplication.demo.service;

import com.loginApplication.demo.model.User;

public interface UserService {

	
	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
