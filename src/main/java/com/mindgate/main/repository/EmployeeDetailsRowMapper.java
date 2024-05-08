package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.domain.ProjectDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails>{

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		LoginDetails loginDetails = new LoginDetails();
		employeeDetails.setLoginDetails(loginDetails);
		
		ProjectDetails projectDetails = new ProjectDetails();
		employeeDetails.setProjectDetails(projectDetails);
		
        employeeDetails.setEmployeeId(rs.getInt("employee_id"));
        employeeDetails.setFirstName(rs.getString("first_name"));
        employeeDetails.setLastName(rs.getString("last_name"));
        employeeDetails.setDesignation(rs.getString("designation"));
        employeeDetails.setOnBench(rs.getString("on_bench"));
        employeeDetails.setSkill1(rs.getString("skill_1"));
        employeeDetails.setSkill2(rs.getString("skill_2"));
        employeeDetails.setSkill3(rs.getString("skill_3"));
        employeeDetails.setReportingManager(rs.getInt("reporting_manager"));
        employeeDetails.getLoginDetails().setLoginId(rs.getInt("login_id"));
        employeeDetails.getProjectDetails().setProjectId(rs.getInt("project_id"));
        employeeDetails.getProjectDetails().setDescription(rs.getString("description"));
        employeeDetails.getProjectDetails().setProjectBudget(rs.getDouble("project_budget"));
        employeeDetails.getProjectDetails().setUsedBudget(rs.getDouble("used_budget"));
        employeeDetails.getProjectDetails().setBalanceBudget(rs.getDouble("balance_budget"));
        return employeeDetails;

	}
	

}
