package com.example.studentmanagementsystem.services.impl;

import com.example.studentmanagementsystem.entity.StudentModel;
import com.example.studentmanagementsystem.repository.StudentRepository;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentModel> getStudents() {
        return studentRepository.findAll();
    }
}
