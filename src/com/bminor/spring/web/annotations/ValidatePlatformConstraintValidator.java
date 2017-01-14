package com.bminor.spring.web.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatePlatformConstraintValidator implements ConstraintValidator<ValidatePlatform, String> {

	private int min;
	@Override
	public void initialize(ValidatePlatform constraintAnnotation) {
		// TODO Auto-generated method stub
		min = constraintAnnotation.min();
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if( value.length() >= min )
			return true;
		return false;
	}

}
