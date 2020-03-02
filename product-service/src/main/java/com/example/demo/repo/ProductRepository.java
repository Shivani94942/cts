package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
