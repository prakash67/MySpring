package com.annotationValidator;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidater implements ConstraintValidator<IsValidDate, Date> {

	private int minAge;

	@Override
	public void initialize(IsValidDate isValidDate) {
		this.minAge = isValidDate.minAge();

	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub

		Calendar currentDate = Calendar.getInstance();
		int eligibleYear = (currentDate.get(Calendar.YEAR) - minAge);
		int eligibleMonth = (currentDate.get(Calendar.MONTH) + 1);
		int eligibleDate = ((currentDate.get(Calendar.DAY_OF_MONTH)));
		System.out.println(eligibleYear + " " + eligibleMonth + " "
				+ eligibleDate);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.YEAR) + " "
				+ (cal.get(Calendar.MONTH) + 1) + " "
				+ cal.get(Calendar.DAY_OF_MONTH));

		if (cal.get(Calendar.YEAR) < eligibleYear) {
			return true;
		} else if (cal.get(Calendar.YEAR) == eligibleYear) {
			if ((cal.get(Calendar.MONTH) + 1) < eligibleMonth) {
				return true;
			} else if ((cal.get(Calendar.MONTH) + 1) == eligibleMonth) {
				if (cal.get(Calendar.DAY_OF_MONTH) <= eligibleDate) {
					return true;
				}
			}
		}
		return false;
	}
}
