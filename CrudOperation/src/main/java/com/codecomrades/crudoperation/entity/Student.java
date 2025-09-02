package com.codecomrades.crudoperation.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "StudentData")
public class Student {

    @Id
    private long id;

    private String name;
    private int age;
    @OneToMany (cascade = CascadeType.)
    private List<Teacher>Tl;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
