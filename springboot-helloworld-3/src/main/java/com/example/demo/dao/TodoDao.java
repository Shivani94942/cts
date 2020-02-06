package com.example.demo.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Todo;

@Repository
@Transactional
public interface TodoDao extends JpaRepository<Todo, Integer> {


	public List<Todo> findByTodoName(String todoName);
	public void deleteByTodoName(String todoName);

}
