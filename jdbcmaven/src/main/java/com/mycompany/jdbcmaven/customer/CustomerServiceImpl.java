package com.mycompany.jdbcmaven.customer;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;


public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.customer.CustomerServiceImpl");
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(String uId,String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(uId,firstName, lastName, email);
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		
		return dao.displayAllCustomers();
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		return dao.findById(uId);
	}

	@Override
	public Customer updateCustomer(String firstName, String lastName, String email,String uId) throws SQLException {
		return dao.updateCustomer(firstName, lastName, email,uId);
	}

	@Override
	public String deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(uId);
		
	}

	@Override
	public List<Customer> findByName(String lastName) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findByName(lastName);
	}

}