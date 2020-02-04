package com.mycompany.customer.bean;

import java.util.List;

import com.mycompany.customer.bean.Customer;

public interface CustomerService {

	public Customer createCustomer(String customerId,String firstName,String lastName,String email);
	public List<Customer> displayAllCustomers();

}
