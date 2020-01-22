package com.mycompany.hibernatetodo_one_to_one_map.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="task_name")
	private String taskName;
	
	@Column(name="author")
	private String author;
	
	public Task() {
		
	}
	

	public Task(String taskName, String author) {
		super();
		
		this.taskName = taskName;
		this.author = author;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", author=" + author + "]";
	}
	
	
}