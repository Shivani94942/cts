package com.mycompany.spring.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Student {

	@NotNull
	@Size(min = 8,max = 15,message = "first name is required")
	private String firstName;
	
	@NotNull
	@Size(min = 8,max = 15,message = "last name is required")
	private String lastName;
	
	private String country;
	
	@Email(message = "enter proper mail id")
	private String email;
	
	@Range(min = 18,max = 55)
	private int age;
	
	@Pattern(regexp = "([0-9]{6}|[0-9]{3}\\s[0-9]{3})",message = "")
	private String zipCode;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favLanguage;
	
	private String[] operatingSystems;
	
public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("select", "select..");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}
}
