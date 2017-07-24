package com.annotationValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidator implements
		ConstraintValidator<IsVaildNumber, Long> {

	private long minLenth;

	private long maxLenth;

	private long minAge;

	@Override
	public void initialize(IsVaildNumber isVaildMobileNumber) {
		this.minLenth = isVaildMobileNumber.minLenth();
		this.maxLenth = isVaildMobileNumber.maxLenth();
		this.minAge = isVaildMobileNumber.minAge();
	}

	@Override
	public boolean isValid(Long param,
			ConstraintValidatorContext paramConstraintValidatorContext) {

		if (minAge == 0) {
			if (param.toString().length() >= minLenth
					&& param.toString().length() <= maxLenth) {
				return true;
			}
			return false;
		} else if (param.toString().length() >= minLenth
				&& param.toString().length() <= maxLenth && param >= minAge) {
			return true;
		}
		return false;
	}

}
