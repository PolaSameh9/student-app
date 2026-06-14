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

        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student s = new Student();
        s.setName("Raj");
        s.setAge(32);

        repo.save(s);
    }
}
