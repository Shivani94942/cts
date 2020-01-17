package com.mycompany.booking.airbooking.fp;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.mycompany.booking.airbooking.fp.PassengerDao;
import com.mycompany.booking.airbooking.fp.PassengerDaoImpl;

public class FlightServiceImpl implements FlightService{
	
	static Logger logger=Logger.getLogger("com.mycompany.booking.airbooking.fp.FlightServiceImpl");
	private PassengerDao dao;
	{
		dao=new PassengerDaoImpl();
	}


	@Override
	public Passenger createPassenger(String userId, String password) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createPassenger(userId,password);
	}


	@Override
	public List<Passenger> findById(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(userId);
	}
	
	


}
