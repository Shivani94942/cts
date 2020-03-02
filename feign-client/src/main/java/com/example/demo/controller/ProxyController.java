package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceClient;

@RestController
public class ProxyController {
	
	@Autowired
	UserServiceClient serviceclient;
	
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return serviceclient.getAllUsers();
	}

}
