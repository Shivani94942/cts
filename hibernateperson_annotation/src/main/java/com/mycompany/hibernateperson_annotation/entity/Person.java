package com.mycompany.hibernateperson_annotation.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uId;
	private String cName;
	private LocalDate dateOfBirth;
	public Person(String uId, String cName, LocalDate dateOfBirth) {
		super();
		this.uId = uId;
		this.cName = cName;
		this.dateOfBirth = dateOfBirth;
	}

	

}
