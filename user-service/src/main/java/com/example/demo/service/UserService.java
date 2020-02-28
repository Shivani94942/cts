package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getAllUsers();
	
	public Optional<User> findById(String id);
	
	public void deleteUser(String id);
	
	public void deleteAll();
	
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByName(String name);
	

}
