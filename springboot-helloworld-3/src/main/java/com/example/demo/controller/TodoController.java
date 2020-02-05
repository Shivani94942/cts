package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.error.ErrorMessage;
import com.example.demo.error.TodoNotFoundException;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/to")
public class TodoController {
	
	private TodoService todoService;

	@Autowired
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	@ExceptionHandler
	  public ResponseEntity<ErrorMessage> handleError1(TodoNotFoundException be) 
	  {
		  ErrorMessage errorMessage=new ErrorMessage();
		  errorMessage.setMessage(be.getMessage());
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
	  
	  @GetMapping("/todos")
	  public List<Todo> getAllTodos()
	  {
		  return todoService.getAllTodos();
	  }
	
	  @GetMapping("/todos/{id}")
	  public Optional<Todo> getTodoById(@PathVariable Integer id)
	  {
		  Optional<Todo> todo=todoService.getTodoById(id);
		  if(!todo.isPresent())
		  {
			  throw new TodoNotFoundException("Todo not found with todo id : "+id);
		  }
		  
		  return todo;
	  }
	  
	  @PostMapping("/todo")
	  public Todo createTodo(@RequestBody Todo todo)
	  {
		  todo.setId(0);
		  
		  return todoService.createTodo(todo);
		  
	  }

	  
	  
}
