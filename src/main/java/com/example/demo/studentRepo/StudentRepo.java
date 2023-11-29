package com.example.demo.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

import com.example.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
