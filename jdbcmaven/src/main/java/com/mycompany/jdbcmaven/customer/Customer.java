package com.mycompany.jdbcmaven.customer;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer implements Serializable {

	private static final long serialVersionUID = -375065079056659899L;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String uId;
	public Customer( String firstName, String lastName, String email,String uId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.uId=uId;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", uId=" + uId
				+ "]";
	}

}