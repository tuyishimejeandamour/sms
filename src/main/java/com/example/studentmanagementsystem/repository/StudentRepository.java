package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.entity.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
