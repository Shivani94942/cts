package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Item {
	
	@Id
	private String itemId;
	private String itemName;
	private double itemPrice;

}
