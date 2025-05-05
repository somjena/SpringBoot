package com.codecomrades.crudoperation.controller;

import com.codecomrades.crudoperation.entity.Student;
import com.codecomrades.crudoperation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
    @Autowired
    Service service;
    @PostMapping("/save")
    public String register(@RequestBody Student student){
        service.save(student);
        return "Data Saved Successfully";

    }
}
