package com.example.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuppressWarnings("serial")
public class ItemNotFoundException extends RuntimeException {
	
	private String message;
	

}
