package com.kaungshan.springtest.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    @GeneratedValue(generator = "student_seq", strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;

    public LocalDate dob;
    public String email;
    @Transient
    public Integer age;
    public Student(){

    }
    public Student(Long id,
                   String name,
                   LocalDate dob,
                   String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }
    public  Student(String name,
                    LocalDate dob,
                    String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();

    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
