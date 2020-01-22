package com.mycompany.hibernatetodo_one_to_one_map.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="")
	private int taskId;
	
	@Column(name="todo_name")
	private String todoName;

	@Column(name="dob")
	private String dob;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="task_id")
	private Task task;

	public Todo(String todoName, String dob) {
		super();
		
		this.todoName = todoName;
		this.dob = dob;
		
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Todo [taskId=" + taskId + ", todoName=" + todoName + ", dob=" + dob + ", task=" + task + "]";
	}
	
	
	
	
}