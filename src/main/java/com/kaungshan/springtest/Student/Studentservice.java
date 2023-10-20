package com.kaungshan.springtest.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class Studentservice {
    private final StudentRepository studentRepository;
    @Autowired
    public Studentservice(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
//        return List.of(
//                new Student(1L, "Kaung", 20, LocalDate.of(2000, 1, 1), "kaung@gmail.com"),
//                new Student(2L, "Kim", 21, LocalDate.of(2000, 1, 1), "kim@gmail.com"),
//                new Student(3L, "Kim", 22, LocalDate.of(2000, 1, 1), "kim2@gmail.com")
//        ) ;
        return studentRepository.findAll();
    }
}
