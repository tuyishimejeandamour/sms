package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handle getall student request

    @GetMapping("/students")
    public String getAllStudent (Model model){
        model.addAttribute("students",studentService.getStudents());

        return  "students";
    }

}
