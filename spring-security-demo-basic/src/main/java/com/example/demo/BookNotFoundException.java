package com.example.demo;

public class BookNotFoundException extends RuntimeException {

    
	

	
	private static final long serialVersionUID = 8302385881238586236L;

	public BookNotFoundException(Long id) {
        super("Book id not found : " + id);
    }

}
