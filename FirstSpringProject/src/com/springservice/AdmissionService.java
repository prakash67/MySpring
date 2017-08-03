package com.springservice;

import org.springframework.stereotype.Service;

import com.springBean.AdmissionBean;

@Service
public interface AdmissionService {

	public String getadmission(AdmissionBean admissionBean);

	public long currentDOB(AdmissionBean admissionBean);

}
