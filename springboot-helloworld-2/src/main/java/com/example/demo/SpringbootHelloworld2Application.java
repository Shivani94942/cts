package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@SpringBootApplication
public class SpringbootHelloworld2Application implements CommandLineRunner {
	
	private BookDao bookDao;
	
	@Autowired
	public SpringbootHelloworld2Application(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworld2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookDao.save(new Book(100,"Book1","Author1"));
		bookDao.save(new Book(101,"Book2","Author2"));
		bookDao.save(new Book(102,"Book3","Author3"));
		bookDao.save(new Book(103,"Book4","Author4"));
		
	}

}
