package com.mycompany.jdbcconfig.dao;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.jdbcconfig.model.Customer;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> displayAllCustomers()throws SQLException;
	public List<Customer> findCustomerById(String uId) throws SQLException;
	public int updateCustomerById(String uid,String firstName) throws SQLException;
	public int deleteCustomer(String uid) throws SQLException;
	
	
}