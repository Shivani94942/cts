package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Item;
import com.example.demo.entity.Product;
import com.example.demo.repository.ItemRepository;

@Service
//@EnableTransactionManagement
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;
	
	
	@Override
	@Transactional
	public Item create(Item item) {
		
		item.setDate(LocalDateTime.now());
		String str[]=UUID.randomUUID().toString().split("-");
		Product product=new Product();
		product.setProductId(str[0]);
		product.setBrand(product.getBrand());
		product.setCatagory(product.getCatagory());
		item.setProduct(product);
		return itemRepository.save(item);
	}

	@Override
	@Transactional
	public List<Item> getAllItems() {
		
		return itemRepository.findAll();
	}

	@Override
	public Optional<Item> getItemByItemId(String itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId);
	}

	@Override
	public void deleteByItemId(String itemId) {
		
		itemRepository.deleteById(itemId);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		itemRepository.deleteAll();
		
	}

	@Override
	public void deleteItemByItemName(String itemName) {
		itemRepository.deleteItemByItemName(itemName);
	}

	@Override
	public void deleteItemByItemNameAndItemId(String itemName, String itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteItemByItemNameAndItemId(itemName, itemId);
		
	}

	@Override
	public void deleteItemByItemNameAndItemPrice(String itemName, double itemPrice) {
		// TODO Auto-generated method stub
		itemRepository.deleteItemByItemNameAndItemPrice(itemName, itemPrice);
		
	}

	

}
