package crm.service;

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

}
