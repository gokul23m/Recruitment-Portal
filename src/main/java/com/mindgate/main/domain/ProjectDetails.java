package com.mindgate.main.domain;

public class ProjectDetails {
	private int projectId;
	private String description;
	private double projectBudget;
	private double usedBudget;
	private double balanceBudget;
	private EmployeeDetails employeeDetails;

	public ProjectDetails() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDetails(int projectId, String description, double projectBudget, double usedBudget,
			double balanceBudget, EmployeeDetails employeeDetails) {
		super();
		this.projectId = projectId;
		this.description = description;
		this.projectBudget = projectBudget;
		this.usedBudget = usedBudget;
		this.balanceBudget = balanceBudget;
		this.employeeDetails = employeeDetails;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(double projectBudget) {
		this.projectBudget = projectBudget;
	}

	public double getUsedBudget() {
		return usedBudget;
	}

	public void setUsedBudget(double usedBudget) {
		this.usedBudget = usedBudget;
	}

	public double getBalanceBudget() {
		return balanceBudget;
	}

	public void setBalanceBudget(double balanceBudget) {
		this.balanceBudget = balanceBudget;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", description=" + description + ", projectBudget="
				+ projectBudget + ", usedBudget=" + usedBudget + ", balanceBudget=" + balanceBudget
				+ ", employeeDetails=" + employeeDetails + "]";
	}

}
