package com.bminor.spring.web.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatePriceConstraintValidator implements ConstraintValidator<ValidatePrice, String> {

	private int min;

	@Override
	public void initialize(ValidatePrice constraintAnnotation) {
		min = constraintAnnotation.min();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if( value.length() < min )
			return false;

		if( value.matches( "\\d+\\.\\d{2}" ) ){
			return true;
		}
		
		return false;
	}

}
