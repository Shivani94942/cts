package com.mycompany.spring_hibernate_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.spring_hibernate_demo.entity.UserDetail;

@Service("service")
public class UserServiceImpl implements UserService {

	private UserDao dao;
	@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}



	@Override
	@Transactional
	public UserDetail createUser(UserDetail user) {
		
		return dao.createUser(user);
	}

}
