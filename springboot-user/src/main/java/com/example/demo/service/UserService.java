package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;

public interface UserService {
	
	public SharedUser createUser(User user);
	public SharedUser findUserById(Integer id);


}
