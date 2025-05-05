package com.codecomrades.crudoperation.service;

import com.codecomrades.crudoperation.entity.Student;
import com.codecomrades.crudoperation.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private StudentRepo repo;

    public void save(Student student){
        repo.save(student);

    }
}
