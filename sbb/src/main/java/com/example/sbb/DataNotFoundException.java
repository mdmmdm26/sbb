package com.example.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException { //예외클래스
	private static final long serialVersionUTD = 1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
