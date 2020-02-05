package com.example.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {
	
	private String message;
	

}
