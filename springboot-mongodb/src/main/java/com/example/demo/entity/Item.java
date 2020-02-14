package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Setter
@Getter
@ToString(exclude = "date")
public class Item {
	
	@Id
	private String itemId;
	private String itemName;
	private double itemPrice;
	@JsonIgnore
	private LocalDateTime date;
	private Product product;
	
	public Item(String itemName, double itemPrice, Product product) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.product = product;
	}
	
	
	

}
