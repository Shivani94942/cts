package com.mycompany.booking.airbooking.fp;

import java.sql.SQLException;
import java.util.List;

public interface FlightService {

	public Passenger createPassenger(String userId,String password) throws SQLException;

	public List<Passenger> findById(String userId) throws SQLException;
}
