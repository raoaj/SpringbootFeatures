package com.example.springboot_4_features.AnnotationDemo.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface MyAnnotation {
    int myIntValue() default 0;
    String name() default "Aravinda Rao";
    String city() default "Hubli";
}
