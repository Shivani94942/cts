package com.mycompany.hibernateperson_annotation.service;

import java.io.IOException;
import java.util.List;

import com.mycompany.hibernateperson_annotation.dao.PersonDao;
import com.mycompany.hibernateperson_annotation.dao.PersonDaoImpl;
import com.mycompany.hibernateperson_annotation.entity.Person;

public class PersonServiceimpl implements PersonService {

	private PersonDao dao;
	{
		dao=new PersonDaoImpl();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return dao.getAllPersons();
	}

	@Override
	public Person getPersonByid(Integer id) {
		// TODO Auto-generated method stub
		return dao.getPersonByid(id);
	}

	@Override
	public Person updatePerson(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updatePerson(id);
	}

	@Override
	public Person deletePerson(Integer id) {
		return dao.deletePerson(id);

	}

}
