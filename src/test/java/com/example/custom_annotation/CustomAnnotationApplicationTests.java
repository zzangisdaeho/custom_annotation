package com.example.custom_annotation;

import com.example.custom_annotation.annotation.CustomAnnotationMap;
import com.example.custom_annotation.service.AnnotationTestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootTest
class CustomAnnotationApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {

        Class annotationTestService = CustomAnnotationMap.annotationMap.get("AnnotationTestService");

        AnnotationTestService bean = applicationContext.getBean(annotationTestService.getSimpleName(), AnnotationTestService.class);

        bean.execute();
    }

//    private changeFirstLetter(String target){
//        String firstLtr = target.substring(0, 1);
//        String restLtrs = target.substring(1, target.length());
//
//        firstLtr = firstLtr.toUpperCase();
//        str = firstLtr + restLtrs;
//        System.out.println("The modified string is: "+str);
//    }

}
