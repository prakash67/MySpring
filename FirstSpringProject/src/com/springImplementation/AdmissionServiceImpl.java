package com.springImplementation;

import com.springBean.AdmissionBean;
import com.springservice.AdmissionService;

public class AdmissionServiceImpl implements AdmissionService {
	

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
