package com.mycompany.jdbcconfig.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.jdbcconfig.dao.CustomerDao;
import com.mycompany.jdbcconfig.model.Customer;

@Component("service")
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;

	@Autowired
	public CustomerServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.displayAllCustomers();
	}

	@Override
	public List<Customer> findCustomerById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findCustomerById(uId);
	}

	@Override
	public int updateCustomerById(String uid,String firstName) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomerById(uid,firstName);
	}

	@Override
	public int deleteCustomer(String uid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(uid);
	}

}