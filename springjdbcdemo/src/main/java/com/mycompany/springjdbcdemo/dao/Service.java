package com.mycompany.springjdbcdemo.dao;

import java.sql.SQLException;

import com.mycompany.springjdbcdemo.model.Customer;

public class Service {

	CustomerDao dao;
	public Customer createCustomer(Customer customer) throws SQLException
	{
		return dao.createCustomer(customer);
	}

}
