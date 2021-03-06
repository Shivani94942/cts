package comm;

import java.util.Set;

public class CustomerService {
	
	private CustomerDao customerDao;
	{
		customerDao=new CustomerDao();
	}
	
	public void addCustomer(int customerId,String firstName,String lastName,String email)
	{
		customerDao.createCustomer(customerId, firstName, lastName, email);
		System.out.println("customer added successfully");
	}
	
	public Set<Customer> getAllCustomers()
	{
		return customerDao.getAllCustomers();
	}

}
