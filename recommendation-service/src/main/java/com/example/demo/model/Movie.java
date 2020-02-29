package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Document
@Data
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String name;
	
	private String synopsis;

	
	public Movie() {
		super();
	}

	public Movie(String id, String name, String synopsis) {
		super();
		this.id = id;
		this.name = name;
		this.synopsis = synopsis;
	}

	
	
	

}
