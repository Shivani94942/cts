package com.mycompany.customer.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
		
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}


	
}
