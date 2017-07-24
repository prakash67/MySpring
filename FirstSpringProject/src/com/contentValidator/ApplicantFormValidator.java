package com.contentValidator;

import java.beans.PropertyEditorSupport;

public class ApplicantFormValidator extends PropertyEditorSupport {
	

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(text.contains("Mr.")|| text.contains("Ms.")){
		setValue(text);
		}else{
			text= "Mr."+text;
			setValue(text);
		}

	}

}
