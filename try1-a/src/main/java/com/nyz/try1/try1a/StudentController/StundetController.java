package com.nyz.try1.try1a.StudentController;

import com.nyz.try1.try1a.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StundetController {

    @Autowired
    Student student;

    @RequestMapping
    public Student getP(String name){
        Student student = new Student();





        return student;
    }



}
