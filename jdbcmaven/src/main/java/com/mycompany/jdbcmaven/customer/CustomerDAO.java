package com.mycompany.jdbcmaven.customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
	
	public Customer createCustomer(String firstName,String lastName,String email,String uId) throws SQLException;
	public List<Customer> displayAllCustomers() throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public Customer updateCustomer(String firstName, String lastName, String email,String uId) throws SQLException;
	public String deleteCustomer(String uId) throws SQLException; 
	public List<Customer> findByName(String lastName) throws SQLException;
}