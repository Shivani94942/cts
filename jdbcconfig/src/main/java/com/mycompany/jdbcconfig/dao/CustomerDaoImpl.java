package com.mycompany.jdbcconfig.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompany.jdbcconfig.model.Customer;
import com.mycompany.jdbcconfig.model.CustomerRowMapper;

@Component("dao")

public class CustomerDaoImpl implements CustomerDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customers(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		
		String query="select uid,first_name,last_name,email from customers";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> findCustomerById(String uid) throws SQLException {
		String query="select uid,first_name,last_name,email from customers where uid=?";
		return jdbcTemplate.query(query, new Object[] {uid},new CustomerRowMapper());
	}

	@Override
	public int updateCustomerById(String uid,String firstName) throws SQLException {
		String query="update customers set first_name=? where uid=?";
		return jdbcTemplate.update(query,firstName,uid);
	}

	@Override
	public int deleteCustomer(String uid) throws SQLException {
		String query="delete from customers where uid=?";
		return jdbcTemplate.update(query,uid);
	}

	
}