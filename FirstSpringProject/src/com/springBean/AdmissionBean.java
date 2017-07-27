package com.springBean;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import com.annotationValidator.IsVaildNumber;
import com.annotationValidator.IsValidDate;
import com.springInterface.ApplicantAddress;

public class AdmissionBean {
	
	
	private AdmissionBean admissionBean;
	
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
	public AdmissionBean getAdmissionBean() {
		return admissionBean;
	}

	public void setAdmissionBean(AdmissionBean admissionBean) {
		this.admissionBean = admissionBean;
	}



}
