package com.example.custom_annotation;

import com.example.custom_annotation.dto.ValidationTestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
public class CustomValidationTest {

    @Autowired
    Validator validator;

    @Test
    void validationTest(){
        ValidationTestDTO validationTestDTO = new ValidationTestDTO(null, 0);

        Set<ConstraintViolation<ValidationTestDTO>> validate = validator.validate(validationTestDTO);

        for (ConstraintViolation<ValidationTestDTO> validationTestDTOConstraintViolation : validate) {
            String message = validationTestDTOConstraintViolation.getMessage();
            System.out.println("message = " + message);
        }
    }
}
