package com.mindgate.main.service;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;

public interface EmployeeLoginDetailsServiceInterface {
	public EmployeeDetails getEmployeeDetails(LoginDetails loginDetails);
}
