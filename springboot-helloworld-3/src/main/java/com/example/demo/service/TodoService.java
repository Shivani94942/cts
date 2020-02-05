package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Todo;

public interface TodoService {

	public List<Todo> getAllTodos();
	public Optional<Todo> getTodoById(Integer id);
	public Todo createTodo(Todo todo);
}
