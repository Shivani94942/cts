package customer1.dao;

import java.util.List;

import customer1.model.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	 public Customer findById(int id);
	 public void update(Customer customer);
	 public void delete(Customer customer);
	
}
