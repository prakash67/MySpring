package com.springcontroller;

import java.util.ArrayList;

import org.apache.tomcat.util.http.ContentType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBean.ApplicantDetailsBean;

@RestController
public class ApplicantRESTAPIController {

	//*********** Retrieving all the applicants details*************//

//	@ResponseBody  no need to specify if @RestController annotation is specified
	@ResponseBody 
	@RequestMapping(value = "/applicants", method = RequestMethod.GET )
	public ArrayList<ApplicantDetailsBean> getApplicantList() {

		ApplicantDetailsBean applicant1 = new ApplicantDetailsBean();
		applicant1.setApplicantName("madhan");

		ApplicantDetailsBean applicant2 = new ApplicantDetailsBean();
		applicant2.setApplicantName("vignesh");

		ApplicantDetailsBean applicant3 = new ApplicantDetailsBean();
		applicant3.setApplicantName("Gopi");

		ArrayList<ApplicantDetailsBean> applicantsList = new ArrayList<ApplicantDetailsBean>();
		applicantsList.add(applicant1);
		applicantsList.add(applicant2);
		applicantsList.add(applicant3);

		return applicantsList;

	}

	//********** Retrieving details of a single applicant************//
	@ResponseBody
	@RequestMapping(value = "/applicants/{name}", method = RequestMethod.GET)
	public ApplicantDetailsBean applicantDetails(@PathVariable("name") String applicantName) {

		ApplicantDetailsBean details = new ApplicantDetailsBean();
		details.setApplicantName(applicantName);
		details.setGender("male");

		return details;

	}
	
	@ResponseBody
	@RequestMapping(value="/applicants/{name}", method = RequestMethod.PUT , headers = "ContentType = application/xml")
	public boolean updateDetails(@PathVariable("name")String applicantName , @RequestBody ApplicantDetailsBean applicantDetailsBean) {
		System.out.println("Applicants name: " + applicantName);
		System.out.println("Applicants Details "+ applicantDetailsBean.getApplicantName() +"  " + applicantDetailsBean.getGender());
		
		return true;
	}


}
