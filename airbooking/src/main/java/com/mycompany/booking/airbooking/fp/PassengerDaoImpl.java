package com.mycompany.booking.airbooking.fp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.booking.airbooking.fp.Passenger;

import com.mycompany.booking.airbooking.fp.MyConnectionFactory;

public class PassengerDaoImpl implements PassengerDao{
	static Logger logger=Logger.getLogger("com.mycompany.booking.airbooking.fp.PassengerDaoImpl");
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	private Statement statement = null;
	private Passenger passenger=null;
	List<Passenger> list = null;
	{
		factory=MyConnectionFactory.getFactoryObject();
		try {
			connection=factory.getMyConnection();
			list = new ArrayList<Passenger>();
			logger.info("ok");
		} catch (IOException | SQLException e) {
			
			
			logger.log(Level.WARNING, e.toString());
		}
	}
	@Override
	public Passenger BookFlight(String userId, String password) throws SQLException {
		
		
		return null;
	}
	@Override
	public Passenger createPassenger(String userId, String password) throws SQLException {
		
		passenger=new Passenger(userId,password);
		pStatement=connection.prepareStatement("insert into "
				+ "passanger(user_id,password) "
				+ "values(?,?)");
		pStatement.setString(1, passenger.getUserId());
		pStatement.setString(2, passenger.getPassword());		
		pStatement.executeUpdate();
		return passenger;
	}
	@Override
	public List<Passenger> findById(String userId) throws SQLException {
		// TODO Auto-generated method stub
		return list;
	}
	
	

}
