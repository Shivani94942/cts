package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoDao;
import com.example.demo.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	private TodoDao todoDao;
	@Autowired
	public TodoServiceImpl(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}



	@Override
	public List<Todo> getAllTodos() {
		
		return todoDao.getAllTodos();
	}

}
