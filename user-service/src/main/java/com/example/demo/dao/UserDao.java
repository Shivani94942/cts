package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.User;

@Repository
@EnableTransactionManagement
public interface UserDao extends JpaRepository<User, Integer>{

}
