package com.example.demo;

//import java.time.LocalDateTime;
//import java.util.UUID;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.dao.TodoDao;
//import com.example.demo.entity.Todo;

@SpringBootApplication
public class SpringbootHelloworld3Application implements CommandLineRunner{
	
	/*
	 * private TodoDao todoDao;
	 * 
	 * @Autowired public SpringbootHelloworld3Application(TodoDao todoDao) {
	 * super(); this.todoDao = todoDao; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworld3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * String str[]=UUID.randomUUID().toString().split("-"); todoDao.save(new
		 * Todo(12,str[0], "Testing", LocalDateTime.now())); todoDao.save(new
		 * Todo(13,str[1], "Designing", LocalDateTime.now())); todoDao.save(new
		 * Todo(14,str[2], "Developing", LocalDateTime.now())); todoDao.save(new
		 * Todo(15,str[3], "Analysing", LocalDateTime.now()));
		 */
		
	}
	
	

}
