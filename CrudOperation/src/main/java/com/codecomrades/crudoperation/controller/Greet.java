package com.codecomrades.crudoperation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
    @GetMapping("/welcome")
    public String hello(){
        return "Hey Welcome to our Application";
    }
}
