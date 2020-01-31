package com.mycompany.customer.bean;


import java.util.List;


public interface CustomerDao {
	
	public Customer createCustomer(String customerId,String firstName,String lastName,String email);
	public List<Customer> displayAllCustomers();

}
