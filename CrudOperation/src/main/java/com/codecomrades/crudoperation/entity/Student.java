package com.codecomrades.crudoperation.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
public class Student {

    @Id
    private long id;
    private String name;
    private int age;
    
}
