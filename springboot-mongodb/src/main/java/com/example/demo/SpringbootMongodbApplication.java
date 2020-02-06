package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.repository.ItemRepository;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner{
	/*
	 * private ItemRepository itemRepository;
	 * 
	 * 
	 * public SpringbootMongodbApplication(ItemRepository itemRepository) { super();
	 * this.itemRepository = itemRepository; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
