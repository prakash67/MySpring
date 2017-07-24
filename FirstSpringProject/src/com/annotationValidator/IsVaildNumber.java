package com.annotationValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.annotationValidator.NumberValidator;

@Target({java.lang.annotation.ElementType.METHOD,
	java.lang.annotation.ElementType.FIELD,
	java.lang.annotation.ElementType.ANNOTATION_TYPE,
	java.lang.annotation.ElementType.CONSTRUCTOR,
	java.lang.annotation.ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { NumberValidator.class })
@Documented
@Inherited
public @interface IsVaildNumber {


	String message() default "The entered value is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	public long minLenth() default 0;
	
	public long maxLenth() default 0;
	
	public long minAge() default 0;	
}
