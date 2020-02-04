package com.mycompany.customer.bean;

import java.util.List;

import com.mycompany.customer.bean.Customer;



public class CustomerServiceImpl implements CustomerService{

	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}
	
	@Override
	public Customer createCustomer(String customerId, String firstName, String lastName, String email) {
		
		return dao.createCustomer(customerId,firstName,lastName,email);
	}

	@Override
	public List<Customer> displayAllCustomers() {
		
		return dao.displayAllCustomers();
	}
	
	
	

}
