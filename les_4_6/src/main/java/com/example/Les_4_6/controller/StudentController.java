package com.example.Les_4_6.controller;

import com.example.Les_4_6.entity.Student;
import com.example.Les_4_6.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @RequestMapping("/students")
    public String handler(Model model) {
        List<Student> all = service.getAll();
        model.addAttribute("students", all);
        return "index.html";
    }
}
