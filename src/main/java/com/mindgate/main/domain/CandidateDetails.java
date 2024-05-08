package com.mindgate.main.domain;

public class CandidateDetails {
	private int candidateId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String email;
	private long contactNo;
	private String qualification;
	private String branch;
	private int yearOfExperience;
	private String panNo;
	private String skill1;
	private String skill2;
	private String skill3;
	private String address;
	private LoginDetails loginDetails;

	public CandidateDetails() {
		// TODO Auto-generated constructor stub
	}

	public CandidateDetails(int candidateId, String firstName, String lastName, String dob, String gender, String email,
			long contactNo, String qualification, String branch, int yearOfExperience, String panNo, String skill1,
			String skill2, String skill3, String address, LoginDetails loginDetails) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.qualification = qualification;
		this.branch = branch;
		this.yearOfExperience = yearOfExperience;
		this.panNo = panNo;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.address = address;
		this.loginDetails = loginDetails;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	@Override
	public String toString() {
		return "CandidateDetails [candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", contactNo=" + contactNo
				+ ", qualification=" + qualification + ", branch=" + branch + ", yearOfExperience=" + yearOfExperience
				+ ", panNo=" + panNo + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3=" + skill3 + ", address="
				+ address + ", loginDetails=" + loginDetails + "]";
	}

}
