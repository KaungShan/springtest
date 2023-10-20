package com.kaungshan.springtest.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student Kaung=new Student(
                 "Kaung",
                 LocalDate.of(1998,10,12),
                 "kaung@gmail.com");
            Student Kim=new Student(
                    "Kim",
                    LocalDate.of(1999, 10,12),
                    "kim@gmail.com"
            );
            repository.saveAll(List.of(Kaung,Kim));
        };
    }
}
