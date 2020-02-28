package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		return userService.createUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{userId}")
	public Optional<User> findById(@PathVariable String userId){
		
		return userService.findById(userId);
	}
	
	@PutMapping("/users/{userId}")
	public User updateUser(@RequestBody User user) {
		
		return userService.createUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable String userId) {
		
		userService.deleteUser(userId);
		System.out.println("Delete By Id Successful");
	}

	@DeleteMapping("/users")
	public void deleteAll() {
		userService.deleteAll();
		System.out.println("Delete All Successful");
	}
	
	@GetMapping("/users/findByEmail/{email}")
	public Optional<User> findByEmail(@PathVariable String email)
	{
		return userService.findByEmail(email);
	}
	
	@GetMapping("/users/findByName/{name}")
	public Optional<User> findByName(@PathVariable String name)
	{
		return userService.findByName(name);
	}
}
