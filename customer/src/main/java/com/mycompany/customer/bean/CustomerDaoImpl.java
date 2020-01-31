package com.mycompany.customer.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerDaoImpl implements CustomerDao
{
	
	List<Customer> list=null;
	Customer customer=null;

	@Override
	public Customer createCustomer(int customerId,String firstName,String lastName,String email) {
		customer.setCustomerId(customerId);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		
		return customer;
	}

	
	@Override
	public List<Customer> displayAllCustomers() {
		list.add(customer);
		return list;
	}

}
