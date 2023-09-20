package com.cst438.controller;

import com.cst438.domain.Student;
import com.cst438.domain.StudentDTO;
import com.cst438.domain.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public int createStudent(@RequestBody StudentDTO studentDTO) {
        return 0;
    }

    @DeleteMapping("/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id") int student_id, @RequestParam("force") Optional<String> force) {}

    @PutMapping("/student/{student_id}")
    public void updateStudent(@RequestBody StudentDTO studentDTO) {}

    @GetMapping("/students")
    public Student[] getAllStudents(@RequestParam("name") String name){
        return studentRepository.findByNameStartsWith(name);
    };
}
