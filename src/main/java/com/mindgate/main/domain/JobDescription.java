package com.mindgate.main.domain;

public class JobDescription {
	private int jobId;
	private String title;
	private String requiredSkill1;
	private String requiredSkill2;
	private String requiredSkill3;
	private int yearOfExperience;
	private String qualification;
	private int requiredCandidates;
	private int selectedCandidates;
	private String status;
	private double salary;
	private EmployeeDetails employeeDetails;

	public JobDescription() {
		// TODO Auto-generated constructor stub
	}

	public JobDescription(int jobId, String title, String requiredSkill1, String requiredSkill2, String requiredSkill3,
			int yearOfExperience, String qualification, int requiredCandidates, int selectedCandidates, String status,
			double salary, EmployeeDetails employeeDetails) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.requiredSkill1 = requiredSkill1;
		this.requiredSkill2 = requiredSkill2;
		this.requiredSkill3 = requiredSkill3;
		this.yearOfExperience = yearOfExperience;
		this.qualification = qualification;
		this.requiredCandidates = requiredCandidates;
		this.selectedCandidates = selectedCandidates;
		this.status = status;
		this.salary = salary;
		this.employeeDetails = employeeDetails;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRequiredSkill1() {
		return requiredSkill1;
	}

	public void setRequiredSkill1(String requiredSkill1) {
		this.requiredSkill1 = requiredSkill1;
	}

	public String getRequiredSkill2() {
		return requiredSkill2;
	}

	public void setRequiredSkill2(String requiredSkill2) {
		this.requiredSkill2 = requiredSkill2;
	}

	public String getRequiredSkill3() {
		return requiredSkill3;
	}

	public void setRequiredSkill3(String requiredSkill3) {
		this.requiredSkill3 = requiredSkill3;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getRequiredCandidates() {
		return requiredCandidates;
	}

	public void setRequiredCandidates(int requiredCandidates) {
		this.requiredCandidates = requiredCandidates;
	}

	public int getSelectedCandidates() {
		return selectedCandidates;
	}

	public void setSelectedCandidates(int selectedCandidates) {
		this.selectedCandidates = selectedCandidates;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "JobDescription [jobId=" + jobId + ", title=" + title + ", requiredSkill1=" + requiredSkill1
				+ ", requiredSkill2=" + requiredSkill2 + ", requiredSkill3=" + requiredSkill3 + ", yearOfExperience="
				+ yearOfExperience + ", qualification=" + qualification + ", requiredCandidates=" + requiredCandidates
				+ ", selectedCandidates=" + selectedCandidates + ", status=" + status + ", salary=" + salary
				+ ", employeeDetails=" + employeeDetails + "]";
	}

}
