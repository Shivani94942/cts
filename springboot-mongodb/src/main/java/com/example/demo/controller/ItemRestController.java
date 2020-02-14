package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.error.ErrorMessage;
import com.example.demo.error.ItemNotFoundException;

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
	
	@ExceptionHandler
	  public ResponseEntity<ErrorMessage> handleError1(ItemNotFoundException infe) 
	  {
		  ErrorMessage errorMessage=new ErrorMessage();
		  errorMessage.setMessage(infe.getMessage());
		  errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		  errorMessage.setErrorTime(LocalDateTime.now());
		  return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	  }
	@ExceptionHandler
	  public ResponseEntity<ErrorMessage> handleError2(Exception e) 
	  {
		  ErrorMessage errorMessage=new ErrorMessage();
		  errorMessage.setMessage(e.getMessage());
		  errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		  errorMessage.setErrorTime(LocalDateTime.now());
		  return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
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
		Optional<Item> item=itemService.getItemByItemId(itemId);
		if(!item.isPresent())
		{
			throw new ItemNotFoundException("The item is not found with item id : "+itemId);
		}
		return item;
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
		
			System.out.println("item is deleted successfully....");
	}
	@DeleteMapping("/items")
	public void deleteAll()
	{
		itemService.deleteAll();
		System.out.println("All items are deleted...");
	}
	@DeleteMapping("/items/deleteByItemName/{itemName}")
	public void deleteItemByItemName(@PathVariable String itemName)
	{
		itemService.deleteItemByItemName(itemName);
	}
	@DeleteMapping("/items/deleteByItemNameAndItemId/{itemName}/{itemId}")
	public void deleteItemByItemNameAndItemId(@PathVariable String itemName,@PathVariable String itemId)
	{
		itemService.deleteItemByItemNameAndItemId(itemName, itemId);
	}
	@DeleteMapping("/items/deleteByItemNameAndItemPrice/{itemName}/{itemPrice}")
	public void deleteItemByItemNameAndItemPrice(@PathVariable String itemName,@PathVariable double itemPrice)
	{
		itemService.deleteItemByItemNameAndItemPrice(itemName, itemPrice);
	}
}
