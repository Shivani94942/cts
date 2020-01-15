package jdbc_h2_14_01;

import java.sql.SQLException;
import java.util.List;


public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(firstName, lastName, email);
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		
		return dao.displayAllCustomers();
	}

	@Override
	public List<Customer> findById() throws SQLException {
		return dao.findById();
	}

	@Override
	public Customer updateCustomer(String firstName, String lastName, String email) throws SQLException {
		return dao.updateCustomer(firstName, lastName, email);
	}

}