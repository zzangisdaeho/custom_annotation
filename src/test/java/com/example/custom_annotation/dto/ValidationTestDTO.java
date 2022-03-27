package com.example.custom_annotation.dto;

import com.example.custom_annotation.validation.CustomValidationAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class ValidationTestDTO {

    @CustomValidationAnnotation
    private String name;

    @CustomValidationAnnotation
    private int age;
}
