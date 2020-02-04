package com.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Tester {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper=new ObjectMapper();
			Student student=mapper.readValue(new File("student.json"),Student.class);
			System.out.println(student);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
