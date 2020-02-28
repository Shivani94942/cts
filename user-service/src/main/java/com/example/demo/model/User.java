package com.example.demo.model;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String email;
	private String name;
	
	
	public User(String email, String name) {
		super();
		
		this.email = email;
		this.name = name;
	}
	
	
	

}
