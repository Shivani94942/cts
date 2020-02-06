package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Todo;

public interface TodoService {

	public List<Todo> getAllTodos();
	public Optional<Todo> getTodoById(Integer id);
	public List<Todo> findByTodoName(String todoName);
	public Todo createTodo(Todo todo);
	public void deleteBookById(Integer id);
	public void deleteByTodoName(String todoName);
	public void deleteAll();
}
