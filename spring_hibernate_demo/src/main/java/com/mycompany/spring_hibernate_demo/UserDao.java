package com.mycompany.spring_hibernate_demo;

import com.mycompany.spring_hibernate_demo.entity.UserDetail;

public interface UserDao {

	public UserDetail createUser(UserDetail user);
}
