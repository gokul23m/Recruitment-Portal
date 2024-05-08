package com.mindgate.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;

@Repository
public class EmployeeLoginDetailsRepositrory implements EmployeeLoginDetailsRepositoryInterface{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String GET_LOGIN_DETAILS = "SELECT * FROM login_details WHERE login_id = ? AND password = ?";
	private static final String GET_EMPLOYEE_DETAILS = "SELECT e.employee_id, e.first_name, e.last_name, e.designation, e.on_bench, e.skill_1, e.skill_2,e.skill_3, e.reporting_manager, e.login_id, e.project_id, p.description, p.project_budget, p.used_budget, p.balance_budget FROM employee_details e JOIN login_details l ON e.login_id = l.login_id LEFT JOIN project_details p ON e.project_id = p.project_id WHERE e.login_id = ?";

	@Override
	public EmployeeDetails getEmployeeDetails(LoginDetails loginDetails) {
		Object[] parameters = {loginDetails.getLoginId(), loginDetails.getPassword()};
		LoginDetailsRowMapper loginDetailsRowMapper = new LoginDetailsRowMapper();
		LoginDetails getLoginDetails = jdbcTemplate.queryForObject(GET_LOGIN_DETAILS, loginDetailsRowMapper, parameters);
		System.out.println("getLoginDetails = " + getLoginDetails);
		if(getLoginDetails != null) {
			EmployeeDetailsRowMapper employeeDetailsRowMapper = new EmployeeDetailsRowMapper();
			EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(GET_EMPLOYEE_DETAILS, employeeDetailsRowMapper, getLoginDetails.getLoginId());
			return employeeDetails;
		}
		return null;
	}

}
