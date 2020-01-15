package com.mycompany.jdbcmaven.customer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CustomerDAOImpl implements CustomerDAO {

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
		} catch (IOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		customer=new Customer(firstName, lastName, email);
		pStatement=connection.prepareStatement("insert into "
				+ "customer(first_name,last_name,email) "
				+ "values(?,?,?)");
		pStatement.setString(1, customer.getFirstName());
		pStatement.setString(2, customer.getLastName());
		pStatement.setString(3, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		
		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select first_name,last_name,email from customer");
		while (resultSet.next()) {

			list.add(new Customer(resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getString("email")));

		}

		return list;
	}
	@Override
	public List<Customer> findById() throws SQLException {
		statement=connection.createStatement();
		ResultSet resultSet1 = statement.executeQuery("select first_name,last_name,email from customer where customer_id=2");
		while (resultSet1.next()) {

			list.add(new Customer(resultSet1.getString("first_name"),
					resultSet1.getString("last_name"),
					resultSet1.getString("email")));

		}
		return list;

	}
	@Override
	public Customer updateCustomer(String firstName, String lastName, String email) throws SQLException {
		customer=new Customer(firstName, lastName, email);
		pStatement=connection.prepareStatement("UPDATE customer\r\n" + 
				"SET (first_name,email)=values(?,?)\r\n" + 
				"WHERE customer_id = 2;");
		
		  pStatement.setString(1, customer.getFirstName()); 
		  //pStatement.setString(2,customer.getLastName());
		  pStatement.setString(2, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
		
	}
	@Override
	public Customer deleteCustomer() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
