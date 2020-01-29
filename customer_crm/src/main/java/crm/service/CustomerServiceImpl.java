package crm.service;

import java.util.List;

import crm.dao.CustomerDao;
import crm.dao.CustomerDaoImpl;
import crm.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

}
