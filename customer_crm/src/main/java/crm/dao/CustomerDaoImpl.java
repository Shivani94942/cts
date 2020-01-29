package crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import crm.model.Customer;
import crm.util.CustomerUtil;

public class CustomerDaoImpl implements CustomerDao {

	private Session session;
	private EntityManager entityManager;
	
	{
		session=CustomerUtil.getMySessionfactory().getCurrentSession();
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		
		return customer;
	}
	@Override
	public List<Customer> getAllCustomers() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

}
