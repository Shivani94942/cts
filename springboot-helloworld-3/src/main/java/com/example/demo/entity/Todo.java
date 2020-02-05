package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "todo_id")
	@JsonIgnore
	private String todoId;
	@Column(name = "todo_name")
	private String todoName;
	@Column(name = "created_date")
	@JsonIgnore
	private LocalDateTime createdDate;
	
	
	
	public Todo(String todoId, String todoName, LocalDateTime createdDate) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
		this.createdDate = createdDate;
	}



	public String getTodoId() {
		return todoId;
	}



	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}



	public String getTodoName() {
		return todoName;
	}



	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}



	public LocalDateTime getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}	
	
	

}
