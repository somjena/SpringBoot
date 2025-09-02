package com.example.distribution_manager.Controller;

import com.example.distribution_manager.Entity.Student;
import com.example.distribution_manager.Repo.StudentRepo;
import com.example.distribution_manager.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.save(student);
        return "Data Saved Successfully";
    }






}
