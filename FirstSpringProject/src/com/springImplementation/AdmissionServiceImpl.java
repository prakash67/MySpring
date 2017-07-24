package com.springImplementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBean.AdmissionBean;
import com.springcontroller.AdmissionFormController;
import com.springservice.AdmissionService;

public class AdmissionServiceImpl implements AdmissionService {
	
	@Autowired
	AdmissionFormController admissionFormController;

	@Override
	public String getadmission(AdmissionBean admissionBean) {

		if (admissionBean.getGender().equalsIgnoreCase("male")) {
			admissionBean.setApplicantName("Mr.".concat(admissionBean
					.getApplicantName()));

		}else if (admissionBean.getGender().equalsIgnoreCase("female")){
			admissionBean.setApplicantName("Ms.".concat(admissionBean
					.getApplicantName()));
		}
		return admissionBean.getApplicantName().toString();

		
	}

}
