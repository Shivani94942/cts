package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Item;

public interface ItemService {
	
	 public Item create(Item item);
	 public List<Item> getAllItems();
	 public Optional<Item> getItemByItemId(String itemId);
	 public void deleteByItemId(String itemId);
	 public void deleteAll();
	 public void deleteItemByItemName(String itemName);
	 public void deleteItemByItemNameAndItemId(String itemName,String itemId);
	public void deleteItemByItemNameAndItemPrice(String itemName, double itemPrice);
	
}
