package com.example.springboot_4_features.AnnotationDemo.customannotation;
/* DispatcherServlet → HandlerMapping → RequestMappingHandlerMapping
ClassPathBeanDefinitionScanner, triggered by @ComponentScan, processes the @Controller
ConfigurationClassPostProcessor is the class that processes @Configuration in Spring.
@SuppressWarnings("unused")
ApplyAnnotation applyAnnotation1 = new ApplyAnnotation();
*/



public class DemoAnnotation {
    public static void main(String[] args) {
        ApplyAnnotation applyAnnotation = new ApplyAnnotation();

        if(applyAnnotation.getClass().isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation ann =  applyAnnotation.getClass().getAnnotation(MyAnnotation.class);
            System.out.println(ann.name());
            System.out.println(ann.city());
            System.out.println(ann.myIntValue());
        }



    }
}
