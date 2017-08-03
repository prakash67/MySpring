package com.springImplementation;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.springBean.AdmissionBean;
import com.springservice.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService {

	@Override
	public String getadmission(AdmissionBean admissionBean) {

		if (admissionBean.getGender().equalsIgnoreCase("male")) {
			admissionBean.setApplicantName("Mr.".concat(admissionBean.getApplicantName()));

		} else if (admissionBean.getGender().equalsIgnoreCase("female")) {
			admissionBean.setApplicantName("Ms.".concat(admissionBean.getApplicantName()));
		}
		return admissionBean.getApplicantName();

	}

	@Override
	public long currentDOB(AdmissionBean admissionBean) {

		long applicantAge = 0;

		if (admissionBean.getApplicantDob() != null) {

			Calendar currentDate = Calendar.getInstance();
			int currentYear = (currentDate.get(Calendar.YEAR));

			Calendar cal = Calendar.getInstance();
			cal.setTime(admissionBean.getApplicantDob());
			int applicanteDOY = cal.get(Calendar.YEAR);

			if (currentYear > applicanteDOY) {

				applicantAge = currentYear - applicanteDOY;
				admissionBean.setApplicantAge(applicantAge);
			}

		}
		return applicantAge;
	}

}
