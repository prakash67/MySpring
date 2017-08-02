package com.springcontroller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBean.AdmissionBean;

@RestController
public class ApplicantRESTAPIController {

	//*********** Retrieving all the applicants details*************//

//	@ResponseBody  no need to specify if @RestController annotation is specified
/*	@RequestMapping(value = "/applicants", method = RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE )
	public ArrayList<AdmissionBean> getApplicantList() {

		AdmissionBean applicant1 = new AdmissionBean();
		applicant1.setApplicantName("madhan");

		AdmissionBean applicant2 = new AdmissionBean();
		applicant2.setApplicantName("vignesh");

		AdmissionBean applicant3 = new AdmissionBean();
		applicant3.setApplicantName("Gopi");

		ArrayList<AdmissionBean> applicantsList = new ArrayList<AdmissionBean>();
		applicantsList.add(applicant1);
		applicantsList.add(applicant2);
		applicantsList.add(applicant3);

		return applicantsList;

	}*/

	//********** Retrieving details of a single applicant************//
/*	@ResponseBody
	@RequestMapping(value = "/applicants/{name}", method = RequestMethod.GET)
	public AdmissionBean applicantDetails(@PathVariable("name") String applicantName) {

		AdmissionBean details = new AdmissionBean();
		details.setApplicantName(applicantName);
		details.setGender("male");

		return details;

	}
	*/
	@RequestMapping(value="/applicants/{name}", method = RequestMethod.PUT)
	public boolean updateDetails(@PathVariable("name")String applicantName , @RequestBody AdmissionBean admissionBean) {
		System.out.println("Applicants name: " + applicantName);
		System.out.println("Applicants Details "+ admissionBean.getApplicantName() +"  " + admissionBean.getGender());
		
		return true;
	}


}
