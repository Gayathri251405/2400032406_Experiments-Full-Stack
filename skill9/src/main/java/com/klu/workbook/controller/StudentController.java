package com.klu.workbook.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.workbook.exception.StudentNotFoundException;
import com.klu.workbook.model.Student;
import com.klu.workbook.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){

        Optional<Student> student = repo.findById(id);

        if(student.isEmpty()){
            throw new StudentNotFoundException("Student with ID "+id+" not found");
        }

        return student.get();
    }

}