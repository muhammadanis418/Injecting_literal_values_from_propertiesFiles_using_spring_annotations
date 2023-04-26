package com.example.injecting_literal_values_from_propertiesfiles_using_spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class StudentInfo {

    @Value("${student.name}")
    private  String name;
  @Value("${student.interestedCourse}")
    private String interestedCourse;
   @Value("${student.hobby}")
    private String hobby;
/*


    public StudentInfo(String name, String interestedCourse) {
        this.name = name;
        this.interestedCourse = interestedCourse;
    }  */
/*  No need of setter method when we use @Value above dependencies

    @Value("${student.name}")

    public void setName(String name) {
        this.name = name;
        System.out.println("setName  setter method is called");
    }

   // @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
        System.out.println("setInterestedCourse setter Method is called");
    }

    //@Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
        System.out.println("setHobby setter method is called");
    }
*/

    public void displayInfo(){
        System.out.println("Student Name is:"+name+" Interested Course is: "+interestedCourse+" Hobby is: "+hobby);
    }
}
