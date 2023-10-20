package com.kaungshan.springtest.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path="/api/v1/students")

public class StudentController {

    private final Studentservice studentservice;
    @Autowired
    public StudentController(Studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }
}