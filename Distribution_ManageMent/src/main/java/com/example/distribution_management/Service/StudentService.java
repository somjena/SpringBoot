package com.example.distribution_management.Service;

import com.example.distribution_management.Entity.Student;
import com.example.distribution_management.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo  studentRepo;


    public String save(Student student){
        studentRepo.save(student);
        return "Student Data successfully saved!";
    }

    public List<Student> StudentList(){
        return studentRepo.findAll();
    }

}
