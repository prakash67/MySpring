package com.springBean;

import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.springInterface.ApplicantAddress;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties({ "applicantSkills" })
@JsonPropertyOrder({ "applicant_name", "applicantAge", "gender", "applicantMobile", "applicantDob", "applicantSkills",
		"applicantAddress" })
public class ApplicantDetailsBean {

	@JsonProperty("applicant_name")
	private String applicantName;

	private long applicantAge;

	private String gender;

	private long applicantMobile;

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
