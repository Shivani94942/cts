package com.mycompany.jdbcmaven.customer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.jdbcmaven.customer.MyConnectionFactory;

public class CustomerDAOImpl implements CustomerDAO {

	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.customer.CustomerDAOImpl");
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	PreparedStatement pStatement1=null;
	private Customer customer=null;
	private Statement statement = null;
	List<Customer> list = null;
	{
		factory=MyConnectionFactory.getFactoryObject();
		try {
			connection=factory.getMyConnection();
			list = new ArrayList<Customer>();
			logger.info("ok");
		} catch (IOException | SQLException e) {
			
			
			logger.log(Level.WARNING, e.toString());
		}
	}
	@Override
	public Customer createCustomer(String firstName, String lastName, String email,String uId) throws SQLException {
		customer=new Customer(firstName, lastName, email,uId);
		pStatement=connection.prepareStatement("insert into "
				+ "customer(first_name,last_name,email,uId) "
				+ "values(?,?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.setString(4, customer.getUId());
		pStatement.executeUpdate();
		return customer;
	}
	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		
		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select first_name,last_name,email,uId from customer");
		while (resultSet.next()) {

			list.add(new Customer(resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getString("email"),
					resultSet.getString("uId")));

		}

		return list;
	}
	@Override
	public List<Customer> findById(String uId) throws SQLException {
		pStatement=connection.prepareStatement("select first_name,"
				+ "last_name,email,uId from"
				+ " customer where uId=?");
		pStatement.setString(1, uId);
		ResultSet rSet=pStatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"),rSet.getString("uId"));
			list.add(customer);
		}
		return list;

	}
	@Override
	public Customer updateCustomer(String firstName, String lastName, String email,String uId) throws SQLException {
		customer=new Customer(firstName, lastName, email,uId);
		pStatement=connection.prepareStatement("UPDATE customer\r\n" + 
				"SET (first_name,last_name,email)=values(?,?,?)\r\n" + 
				"WHERE uId= ?;");
		
		  pStatement.setString(1, customer.getFirstName()); 
		  pStatement.setString(2,customer.getLastName());
		  pStatement.setString(3, customer.getEmail());
		  pStatement.setString(4, customer.getFirstName());
		pStatement.executeUpdate();
		return customer;
		
	}
	@Override
	public String deleteCustomer(String uId) throws SQLException {
		pStatement=connection.prepareStatement("delete from customer where uId=?");
		pStatement.setString(1, uId);
		
		/*
		 * ResultSet rSet=pStatement.executeQuery(); List<Customer> list=new
		 * ArrayList<Customer>(); while(rSet.next()) { Customer customer=new Customer(
		 * rSet.getString("first_name"), rSet.getString("last_name"),
		 * rSet.getString("email"),rSet.getString("uId")); list.add(customer); }
		 */
		
		pStatement.executeUpdate();
		return uId;

	}
	public List<Customer> findByName(String lastName) throws SQLException {
		pStatement=connection.prepareStatement("select first_name,"
				+ "last_name,email,uId from"
				+ " customer where last_name=?");
		pStatement.setString(1, lastName);
		ResultSet rSet=pStatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"),rSet.getString("uId"));
			list.add(customer);
		}
		return list;

	}
	

}
