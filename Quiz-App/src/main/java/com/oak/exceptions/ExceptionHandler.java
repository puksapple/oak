package com.oak.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=IndexOutOfBoundsException.class)
	public String listFull() {
		return "noMoreQuestions";
	}
}
