package com.example.distribution_manager.Service;

import com.example.distribution_manager.Entity.Student;
import com.example.distribution_manager.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

    @Autowired
   private StudentRepo studentRepo;

    public Student save(@RequestBody Student student) {
        return studentRepo.save(student);
    }

}
