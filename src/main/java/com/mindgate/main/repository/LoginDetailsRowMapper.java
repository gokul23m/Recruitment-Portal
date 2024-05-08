package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.LoginDetails;

public class LoginDetailsRowMapper implements RowMapper<LoginDetails>{

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int loginId = rs.getInt("login_id");
		String password = rs.getString("password");
		String designation = rs.getString("designation");
		LoginDetails loginDetails = new LoginDetails(loginId,password,designation);
		return loginDetails;
	}

}
