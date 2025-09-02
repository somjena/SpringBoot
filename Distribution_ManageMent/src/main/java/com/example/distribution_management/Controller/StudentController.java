package com.example.distribution_management.Controller;

import com.example.distribution_management.Entity.Student;
import com.example.distribution_management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String AddStudent(@RequestBody Student student){
       String msg =  studentService.save(student);
        return msg;
    }
    @GetMapping("/getall")
public List<Student> getall(){
        return studentService.StudentList();
    }

    }

