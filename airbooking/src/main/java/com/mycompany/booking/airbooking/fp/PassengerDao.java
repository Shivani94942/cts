package com.mycompany.booking.airbooking.fp;

import java.sql.SQLException;
import java.util.List;



public interface PassengerDao {
	
	public Passenger BookFlight(String userId,String password) throws SQLException;
	public Passenger createPassenger(String userId,String password) throws SQLException;
	public List<Passenger> findById(String userId) throws SQLException;

}
