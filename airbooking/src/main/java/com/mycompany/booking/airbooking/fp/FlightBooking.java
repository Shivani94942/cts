package com.mycompany.booking.airbooking.fp;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightBooking implements Serializable{
	
	
	private static final long serialVersionUID = 5864899996741480088L;
	
	private String flightNumber;
	private int noofseats;
	
	public FlightBooking(String flightNumber, int noofseats) {
		super();
		this.flightNumber = flightNumber;
		this.noofseats = noofseats;
	}
	
	
	
	

}
