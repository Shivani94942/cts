package com.mycompany.spring_hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_hibernate_demo.entity.UserDetail;

@Repository("dao")
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	private Session session;

@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		session=sessionFactory.openSession();
		
	}


	@Override
	public UserDetail createUser(UserDetail user) {
		
		session.save(user);
		return user;
	}

}
