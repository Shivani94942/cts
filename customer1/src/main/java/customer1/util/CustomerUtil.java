package customer1.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import customer1.model.Customer;

public class CustomerUtil {
	
	private static SessionFactory factory=null;
	public static SessionFactory getMySessionfactory()
	{
		return new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Customer.class).
				buildSessionFactory();
	
	}

}
