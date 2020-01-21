package com.mycompany.hibernatetodo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Todo {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private int todoId;
	private String uid;
	private String todoName;
	private LocalDateTime creatingDateTime;
	

}
