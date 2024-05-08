package com.mindgate.main.repository;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;

public interface EmployeeLoginDetailsRepositoryInterface {
	public EmployeeDetails getEmployeeDetails(LoginDetails loginDetails);
}
