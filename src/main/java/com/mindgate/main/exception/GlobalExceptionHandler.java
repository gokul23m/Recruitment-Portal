package com.mindgate.main.exception;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(LoginDetailsNotFoundException.class)
	public ResponseEntity<ProblemDetail> handleEmployeeNotFoundException(
			LoginDetailsNotFoundException loginDetailsNotFoundException){
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle("Login Details Not Found");
		problemDetail.setType(URI.create("http://localhost:8080/logindetailscrudapi/"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", "8080");
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
	}
	

}
