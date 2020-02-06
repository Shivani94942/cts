package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;

//import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemRestController {

	
	  
	
	private ItemService itemService;
	
	@Autowired
	public ItemRestController(ItemService itemService) {
		super();
		
		this.itemService = itemService;
	}

	@PostMapping("/items")
	public Item create(@RequestBody Item item)
	{
		return itemService.create(item);
		
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemByItemId(@PathVariable String itemId)
	{
		return itemService.getItemByItemId(itemId);
	}
	
	@PutMapping("/items")
	public Item update(@RequestBody Item item)
	{
		return itemService.create(item);
	}
	@DeleteMapping("/items/{itemId}")
	public void delete(@PathVariable String itemId)
	{
		itemService.deleteByItemId(itemId);
	}
	@DeleteMapping("/items")
	public void deleteAll()
	{
		itemService.deleteAll();
	}
}
