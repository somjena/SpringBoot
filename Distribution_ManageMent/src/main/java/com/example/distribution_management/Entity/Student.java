package com.example.distribution_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private long redg_no;
    private String full_name;
    private boolean bag_status;
    private boolean id_status;
    private boolean bottle_status;

    public Student() {
    }

    public Student(long redg_no, String full_name, boolean bag_status, boolean id_status, boolean bottle_status) {
        this.redg_no = redg_no;
        this.full_name = full_name;
        this.bag_status = bag_status;
        this.id_status = id_status;
        this.bottle_status = bottle_status;
    }

    public long getRedg_no() {
        return redg_no;
    }

    public void setRedg_no(long redg_no) {
        this.redg_no = redg_no;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public boolean isBag_status() {
        return bag_status;
    }

    public void setBag_status(boolean bag_status) {
        this.bag_status = bag_status;
    }

    public boolean isId_status() {
        return id_status;
    }

    public void setId_status(boolean id_status) {
        this.id_status = id_status;
    }

    public boolean isBottle_status() {
        return bottle_status;
    }

    public void setBottle_status(boolean bottle_status) {
        this.bottle_status = bottle_status;
    }
}
