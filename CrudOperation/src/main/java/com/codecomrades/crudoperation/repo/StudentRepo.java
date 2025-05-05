package com.codecomrades.crudoperation.repo;

import com.codecomrades.crudoperation.entity.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , Id> {
}
