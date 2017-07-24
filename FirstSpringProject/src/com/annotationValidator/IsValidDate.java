package com.annotationValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({java.lang.annotation.ElementType.METHOD,
	java.lang.annotation.ElementType.FIELD,
	java.lang.annotation.ElementType.ANNOTATION_TYPE,
	java.lang.annotation.ElementType.CONSTRUCTOR,
	java.lang.annotation.ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { DateValidater.class })
@Documented
@Inherited
public @interface IsValidDate {
	
	String message() default "The entered date is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
	public int minAge() default 0;
	
}
