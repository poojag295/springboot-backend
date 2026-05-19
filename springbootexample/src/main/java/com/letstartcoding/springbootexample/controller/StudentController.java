package com.letstartcoding.springbootexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.letstartcoding.springbootexample.model.Student;
import com.letstartcoding.springbootexample.repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // ✅ GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // ✅ POST - add student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }
}
