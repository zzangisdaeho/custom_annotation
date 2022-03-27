package com.example.custom_annotation.service;

import com.example.custom_annotation.annotation.CustomAnnotation;
import com.example.custom_annotation.annotation.CustomAnnotationMap;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@CustomAnnotation(className = "AnnotationTestService")
@Service
@Slf4j
public class AnnotationTestService {

    public void execute(){
        log.info("AnnotationTestService.execute working");
    }

    @PostConstruct
    public void register(){
        Reflections reflections = new Reflections("com.example.custom_annotation.service");
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(CustomAnnotation.class);

        for (Class<?> annotatedClass : annotatedClasses) {
            CustomAnnotation annotation = annotatedClass.getAnnotation(CustomAnnotation.class);

            CustomAnnotationMap.annotationMap.put(annotation.className(), annotatedClass);
        }
    }
}
