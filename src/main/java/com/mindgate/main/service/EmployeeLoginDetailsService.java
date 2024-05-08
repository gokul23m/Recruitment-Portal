package com.mindgate.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.repository.EmployeeLoginDetailsRepositoryInterface;

@Service
public class EmployeeLoginDetailsService implements EmployeeLoginDetailsServiceInterface{
	
	@Autowired
	private EmployeeLoginDetailsRepositoryInterface employeeloginDetailsRepositoryInterface;

	@Override
	public EmployeeDetails getEmployeeDetails(LoginDetails loginDetails) {
		
		EmployeeDetails employeeDetails = employeeloginDetailsRepositoryInterface.getEmployeeDetails(loginDetails);
		
		return employeeDetails;
	}

}
