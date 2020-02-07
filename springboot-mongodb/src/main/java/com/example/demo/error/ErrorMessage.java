package com.example.demo.error;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorMessage {
	
	private String message;
	private int status;
	private LocalDateTime errorTime;

}
