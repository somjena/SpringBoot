package com.example.distribution_manager.Repo;

import com.example.distribution_manager.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepo extends JpaRepository<Student,Long> {
}
