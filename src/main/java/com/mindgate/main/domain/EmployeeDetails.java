package com.mindgate.main.domain;

public class EmployeeDetails {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String designation;
	private String onBench;
	private String skill1;
	private String skill2;
	private String skill3;
	private int reportingManager;
	private LoginDetails loginDetails;
	private ProjectDetails projectDetails;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String firstName, String lastName, String designation, String onBench,
			String skill1, String skill2, String skill3, int reportingManager, LoginDetails loginDetails,
			ProjectDetails projectDetails) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.onBench = onBench;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.reportingManager = reportingManager;
		this.loginDetails = loginDetails;
		this.projectDetails = projectDetails;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOnBench() {
		return onBench;
	}

	public void setOnBench(String onBench) {
		this.onBench = onBench;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public int getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(int reportingManager) {
		this.reportingManager = reportingManager;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + ", onBench=" + onBench + ", skill1=" + skill1 + ", skill2=" + skill2
				+ ", skill3=" + skill3 + ", reportingManager=" + reportingManager + ", loginDetails=" + loginDetails
				+ ", projectDetails=" + projectDetails + "]";
	}

}
