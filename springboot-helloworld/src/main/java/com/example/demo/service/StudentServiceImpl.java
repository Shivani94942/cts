package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.entity.Student;

@Service("service")
public class StudentServiceImpl implements StudentService {
	/* @Autowired */
	private StudentDao dao;
	
	{
		dao=new StudentDaoImpl();
	}

	@Override
	public Student createStudent(Student student) {
		
		return dao.createStudent(student);
	}

}
