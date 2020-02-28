package com.example.demo.dao;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.User;

@Repository
public interface UserDao extends MongoRepository<User, String>{
	
	public Optional<User> findByEmail(String email);
	public Optional<User> findByName(String name);

}
