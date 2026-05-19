package com.letstartcoding.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.letstartcoding.springbootexample.model.Student;

public
interface StudentRepository extends JpaRepository<Student, Long> {
}