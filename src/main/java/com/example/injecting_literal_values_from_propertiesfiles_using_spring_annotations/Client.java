package com.example.injecting_literal_values_from_propertiesfiles_using_spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
       ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("beans.xml");
     StudentInfo studentInfo=  applicationcontext.getBean("st1",StudentInfo.class);
       studentInfo.displayInfo();
    }
}
