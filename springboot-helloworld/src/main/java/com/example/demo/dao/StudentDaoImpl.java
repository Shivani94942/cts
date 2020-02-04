package com.example.demo.dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository("dao")
@Transactional
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private EntityManager entityManager;	

	
	@Override
	@Transactional
	public Student createStudent(Student student) {
		
		Session session=entityManager.unwrap(Session.class);
		String str[]=UUID.randomUUID().toString().split("-");
		student.setUId(str[0]);
		session.save(student);
		return student;
	}

}
