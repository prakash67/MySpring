package com.springcontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springBean.AdmissionBean;
import com.springservice.AdmissionService;

@Controller
public class AdmissionFormController {

	
	AdmissionService admissionservice;



	@RequestMapping(value = "/admissionForm")
	public ModelAndView admissionForm() throws Exception {

/*		String exceptionOccured = "NULL_POINTER";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			throw new NullPointerException("Null pointer exception");
		}*/
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@ModelAttribute
	public void commonMessage(Model model) {

		model.addAttribute("headerMessgae", "Photon Interactive");

	}

	/*
	 * This is the example for @RequestParam
	 * 
	 * @RequestMapping(value="/admissionSubmission", method=RequestMethod.POST)
	 * public ModelAndView admissionSubmission(@RequestParam Map<String, String>
	 * nameAndAge){
	 * 
	 * ModelAndView modelAndView = new ModelAndView("AdmissionFromSubmission");
	 * String name = nameAndAge.get("applicantName"); int age = 0; try{ age =
	 * Integer.parseInt(nameAndAge.get("applicantAge"));
	 * 
	 * if(!(name.isEmpty()) && age != 0){ modelAndView.addObject("msg","I am "+
	 * name + " and I am "+ age +" years old"); }else{ if(name.isEmpty()){
	 * modelAndView.addObject("msg","please enter the user name"); } }
	 * }catch(NumberFormatException e){
	 * modelAndView.addObject("msg","please enter your age or in correct format"
	 * ); } return modelAndView; }
	 */

	/*
	 * This is by using the @ModelAttribute where we can directly add object to
	 * modelAndView object
	 */

	@InitBinder
	public void initBinder(WebDataBinder binder) throws ParseException {
//		binder.setDisallowedFields(new String[] { "applicantAge" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "applicantDob",
				new CustomDateEditor(dateFormat, true));
		// binder.registerCustomEditor(String.class, "applicantName",
		// new ApplicantFormValidator());

	}


	
	@RequestMapping(value = "/admissionSubmission", method = RequestMethod.POST , headers = "Content-Type=application/json")
	public ModelAndView admissionSubmission(@RequestBody AdmissionBean admissionBean,
			BindingResult result) {

		/*
		 * If we used @RequestParam instead of @Modelattribute we might write
		 * the code like
		 * 
		 * AdmissionBean admissionBean = new AdmissionBean();
		 * admissionBean.setApplicantName(applicantName);
		 * admissionBean.setApplicantAge(applicantAge); 
		 * ModelAndView  modelAndView = new ModelAndView("AdmissionFromSubmission");
		 * modelAndView.addObject("msg",admisssionBean);
		 */
		
		System.out.println(admissionBean.getApplicantName());
		
		if (result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}

		ModelAndView modelAndView = new ModelAndView("AdmissionFromSubmission");
		
		
		return modelAndView;
	}
	
}
