package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;


import com.example.demo.entity.Item;

@Repository
//@Transactional
public interface ItemRepository  extends MongoRepository<Item, String>{
	
	public Optional<Item> getItemByItemId(String itemId);
	public void deleteItemByItemId(String itemId);

}
