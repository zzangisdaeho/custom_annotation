package com.example.custom_annotation.validation;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

@Component
public class CustomValidator implements ConstraintValidator<CustomValidationAnnotation, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return Objects.isNull(value);
    }
}
