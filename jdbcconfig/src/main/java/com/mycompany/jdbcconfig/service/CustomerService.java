package com.mycompany.jdbcconfig.service;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.jdbcconfig.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> displayAllCustomers()throws SQLException;
	public List<Customer> findCustomerById(String uid) throws SQLException;
	public int updateCustomerById(String uid,String firstName) throws SQLException;
	public int deleteCustomer(String uId) throws SQLException;
	
	
}
