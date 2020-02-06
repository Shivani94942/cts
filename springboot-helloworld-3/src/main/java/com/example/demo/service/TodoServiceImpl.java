package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@Service
@EnableTransactionManagement
public class TodoServiceImpl implements TodoService {

	private TodoDao todoDao;
	
	@Autowired
	public TodoServiceImpl(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}

	@Override
	@Transactional
	public List<Todo> getAllTodos() {
		
		return todoDao.findAll();
	}

	@Override
	@Transactional
	public Optional<Todo> getTodoById(Integer id) {
		
		Optional<Todo> todo=todoDao.findById(id);
		
		return todo;
	}

	@Override
	public Todo createTodo(Todo todo) {
		String str[]=UUID.randomUUID().toString().split("-");
		todo.setTodoId(str[0]);
		todo.setCreatedDate(LocalDateTime.now());
		return todoDao.save(todo);
	}

	@Override
	public String deleteTodoById(Integer id) {
	
		todoDao.deleteById(id);
		return null;
		
	}

	@Override
	public void deleteAll() {
		
		todoDao.deleteAll();
		
	}

	@Override
	public List<Todo> findByTodoName(String todoName) {
		// TODO Auto-generated method stub
		return todoDao.findByTodoName(todoName);
	}

	@Override
	public void deleteByTodoName(String todoName) {
		// TODO Auto-generated method stub
		todoDao.deleteByTodoName(todoName);
		
	}

	@Override
	public void deleteByTodoId(String todoId) {
		// TODO Auto-generated method stub
		todoDao.deleteByTodoId(todoId);
		
	}

}
