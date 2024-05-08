package com.mindgate.main.domain;

public class JobApplication {
	private int applicationId;
	private String dateOfApplication;
	private String interviewDate;
	private String status;
	private JobDescription jobDescription;
	private CandidateDetails candidateDetails;
	private EmployeeDetails employeeDetails;

	public JobApplication() {
		// TODO Auto-generated constructor stub
	}

	public JobApplication(int applicationId, String dateOfApplication, String interviewDate, String status,
			JobDescription jobDescription, CandidateDetails candidateDetails, EmployeeDetails employeeDetails) {
		super();
		this.applicationId = applicationId;
		this.dateOfApplication = dateOfApplication;
		this.interviewDate = interviewDate;
		this.status = status;
		this.jobDescription = jobDescription;
		this.candidateDetails = candidateDetails;
		this.employeeDetails = employeeDetails;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(String dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JobDescription getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(JobDescription jobDescription) {
		this.jobDescription = jobDescription;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", dateOfApplication=" + dateOfApplication
				+ ", interviewDate=" + interviewDate + ", status=" + status + ", jobDescription=" + jobDescription
				+ ", candidateDetails=" + candidateDetails + ", employeeDetails=" + employeeDetails + "]";
	}

}
