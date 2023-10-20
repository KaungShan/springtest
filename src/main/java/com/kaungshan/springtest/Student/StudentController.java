package com.kaungshan.springtest.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentservice.registerNewStudent(student);
    }
}