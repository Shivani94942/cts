package com.example.demo.dao;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public class TodoDaoImpl implements TodoDao {

	List<Todo> todoList;
	{
		todoList=new ArrayList<Todo>();
		todoList.add(new Todo("todo1", "testing todo1",LocalDateTime.now()));
		todoList.add(new Todo("todo2", "testing todo2",LocalDateTime.now()));
		todoList.add(new Todo("todo3", "testing todo3",LocalDateTime.now()));
		todoList.add(new Todo("todo4", "testing todo4",LocalDateTime.now()));
		todoList.add(new Todo("todo5", "testing todo5",LocalDateTime.now()));
		
	}
	@Override
	public List<Todo> getAllTodos() {
		
		return todoList;
	}

}
