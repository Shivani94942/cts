package com.example.demo.entity;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(exclude = {"BRAND","CATAGORY"})
public class Product {
	
	private String productId;
	
	private enum BRAND{ SONY,LG,SAMSANG,NOKIA,DELL};
	
	private enum CATAGORY{TV,MOBILE,COMPUTOR,LAPTOP};
	

}
