package com.mycompany.booking.airbooking.fp;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger implements Serializable{
	
	
	private static final long serialVersionUID = -3725796709144514074L;
	private String userId;
	private String password;
	
	public Passenger(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Passanger [userId=" + userId + ", password=" + password + "]";
	}
	
	
	

}
