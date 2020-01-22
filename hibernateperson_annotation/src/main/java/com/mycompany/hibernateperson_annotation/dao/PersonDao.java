package com.mycompany.hibernateperson_annotation.dao;

import java.io.IOException;
import java.util.List;

import com.mycompany.hibernateperson_annotation.entity.Person;

public interface PersonDao {

	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(Integer id);
	public Person updatePerson(Integer id) throws IOException;
	public Person deletePerson(Integer id);
}
