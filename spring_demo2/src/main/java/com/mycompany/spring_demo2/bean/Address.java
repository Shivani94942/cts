package com.mycompany.spring_demo2.bean;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component("add")
public class Address {
	private String line1;
	private String line2;
	private String phno;
	private String zipCode;
	@Override
	public String toString() {
		return "Address [addressLine1=" + line1 + ", addressLine2=" + line2 + ", phoneNumber="
				+ phno + ", zipCode=" + zipCode + "]";
	}
	
	

}