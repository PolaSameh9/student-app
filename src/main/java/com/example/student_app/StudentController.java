package com.example.student_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;
    
    @RequestMapping("/getStudents")
    public List<Student> getStuds(){
        return List.of(
                new Student(1, "Ranga", 21),
                new Student(2, "Manga", 22),
                new Student(3, "Banga", 24)
        );
    }
}
