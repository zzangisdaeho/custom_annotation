package com.example.custom_annotation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CustomValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomValidationAnnotation {

    String message() default "null is not allow";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
