package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(basePackageClasses = User.class)
public class UserServiceApplication implements CommandLineRunner {
	
	private UserDao userDao;	

	@Autowired
	public UserServiceApplication(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
