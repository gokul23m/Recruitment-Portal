package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.exception.LoginDetailsNotFoundException;
import com.mindgate.main.service.EmployeeLoginDetailsServiceInterface;

@RestController
@RequestMapping("employeedetails")
public class EmployeeLoginDetailsController {
	
	@Autowired
	private EmployeeLoginDetailsServiceInterface employeeLoginDetailsServiceInterface;
	
	//http://localhost:8080/employeedetails/getemployeedetails
	@RequestMapping(value = "getemployeedetails", method = RequestMethod.POST)
	public ResponseEntity<?> getEmployeeDetails(@RequestBody LoginDetails loginDetails) {
		EmployeeDetails employeeDetails = employeeLoginDetailsServiceInterface.getEmployeeDetails(loginDetails);
		if(employeeDetails!=null) {
			ResponseEntity<EmployeeDetails> responseEntity = new ResponseEntity<EmployeeDetails>(employeeDetails,
					HttpStatusCode.valueOf(200));
			return responseEntity;
			
		} else {
			throw new LoginDetailsNotFoundException();
		}
	}

}
