package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		
		return userDao.save(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		
		return userDao.findAll();
	}

	@Override
	public Optional<User> findById(Integer userId) {
		
		return userDao.findById(userId);
	}

	@Override
	public void deleteUser(Integer userId) {

			userDao.deleteById(userId);;
	}

}
