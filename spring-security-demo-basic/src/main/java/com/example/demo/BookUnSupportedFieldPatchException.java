package com.example.demo;

import java.util.Set;

public class BookUnSupportedFieldPatchException extends RuntimeException {

   
	private static final long serialVersionUID = 3225009593944667519L;

	public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
