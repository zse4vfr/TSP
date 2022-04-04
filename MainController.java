package com.tsp.asurso.controllers;

import com.tsp.asurso.models.Student;
import com.tsp.asurso.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);

        return "home";
    }

}