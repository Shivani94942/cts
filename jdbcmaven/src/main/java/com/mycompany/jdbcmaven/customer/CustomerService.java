package com.mycompany.jdbcmaven.customer;

import java.sql.SQLException;
import java.util.List;


public interface CustomerService {
	public Customer createCustomer(String uId,String firstName,String lastName,String email) throws SQLException;
	public List<Customer> displayAllCustomers() throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public Customer updateCustomer(String uId,String firstName, String lastName, String email) throws SQLException;
	public String deleteCustomer(String uId) throws SQLException;
	public List<Customer> findByName(String lastName) throws SQLException;
}