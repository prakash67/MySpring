package com.springservice;

import org.springframework.stereotype.Service;

import com.springBean.AdmissionBean;

@Service
public interface AdmissionService {
	
//	@Autowired
//	AdmissionServiceImpl admissionServiceImpl;
	
	
	public String getadmission(AdmissionBean admissionBean);

}
