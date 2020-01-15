package jdbc_h2_14_01;

import java.sql.SQLException;
import java.util.List;


public interface CustomerService {
	public Customer createCustomer(String firstName,String lastName,String email) throws SQLException;
	public List<Customer> displayAllCustomers() throws SQLException;
	public List<Customer> findById() throws SQLException;
	public Customer updateCustomer(String firstName, String lastName, String email) throws SQLException;
}