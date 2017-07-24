package com.springcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * This type of coding id done for extending some base controller class and without using the annotation
 * 
public class HelloController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("HelloMessage", "Hi user I am done my first Step");
		
		return modelAndView;
	}*/

/*
 * Can be done for using a base url.
 * 
 * @RequestMapping("/mobilepay")*/
@Controller
public class HelloController{

	/*
	 * For getting the value form the url separately
	 * 
	 * public ModelAndView helloWorld(@PathVariable("userName") String name , @PathVariable("contryName") String conutry)
	 * 
	 */
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String , String> nameAndCountry){
		
		String name = nameAndCountry.get("userName");
		String country = nameAndCountry.get("countryName");
		ModelAndView modelAndView =  new ModelAndView("HelloPage");
		modelAndView.addObject("msg","I am "+ name+ " and I am from "+ country);
		
		return modelAndView;
		
	}
	
/*	@RequestMapping(value="/admissionFrom")
	public ModelAndView admissionForm(){

		ModelAndView modelAndView =  new ModelAndView("AdmissionForm");
		return modelAndView;
	}
	
	@RequestMapping(value="/admissionSubmission", method=RequestMethod.POST)
	public ModelAndView admissionSubmission(@RequestParam("applicantName") String name, @RequestParam("applicantAge") int age){
				
		ModelAndView modelAndView =  new ModelAndView("AdmissionFromSubmission");
		modelAndView.addObject("msg","I am "+ name + " and I am "+ age +" years old");
		
		return modelAndView;
		
	}*/



}
