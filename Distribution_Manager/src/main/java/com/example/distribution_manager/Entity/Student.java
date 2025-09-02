package com.example.distribution_manager.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private long redg_no;

    private String full_name;
    private String branch_name;
    private long contact_no;
    private boolean id_status;
    private boolean bag_status;

    public Student() {

    }

    public Student(long redg_no, String full_name, String branch_name, long contact_no, boolean id_status, boolean bag_status) {
        this.redg_no = redg_no;
        this.full_name = full_name;
        this.branch_name = branch_name;
        this.contact_no = contact_no;
        this.id_status = id_status;
        this.bag_status = bag_status;
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

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public boolean isId_status() {
        return id_status;
    }

    public void setId_status(boolean id_status) {
        this.id_status = id_status;
    }

    public boolean isBag_status() {
        return bag_status;
    }

    public void setBag_status(boolean bag_status) {
        this.bag_status = bag_status;
    }
}
