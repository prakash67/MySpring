package com.springBean;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.annotationValidator.IsVaildNumber;
import com.annotationValidator.IsValidDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.springInterface.ApplicantAddress;


public class AdmissionBean {

	@Size(min = 4, max = 30)
	@Pattern(regexp = "[^0-9]*")
	private String applicantName;

	private long applicantAge;
	
	private String gender;

	@IsVaildNumber(minLenth = 9, maxLenth = 12)
	private long applicantMobile;

	@IsValidDate(minAge=18)
	private Date applicantDob;

	private ArrayList<String> applicantSkills;

	private ApplicantAddress applicantAddress;

	public String getApplicantName() {
		
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		
		this.applicantName = applicantName;
	}

	public long getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(long applicantAge) {
		this.applicantAge = applicantAge;
	}

	public long getApplicantMobile() {
		return applicantMobile;
	}

	public void setApplicantMobile(long applicantMobile) {
		this.applicantMobile = applicantMobile;
	}

	public Date getApplicantDob() {
		return applicantDob;
	}

	public void setApplicantDob(Date applicantDob) {
		this.applicantDob = applicantDob;
	}

	public ArrayList<String> getApplicantSkills() {
		return applicantSkills;
	}

	public void setApplicantSkills(ArrayList<String> applicantSkills) {
		this.applicantSkills = applicantSkills;
	}

	public ApplicantAddress getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(ApplicantAddress applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



}
