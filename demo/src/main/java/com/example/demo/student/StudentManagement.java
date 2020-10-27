package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagement {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2,"Ilya Zhilka"),
            new Student(3,"Oleg Trufanov")
    );

    @GetMapping
    public List<Student> getAllStudent(){
        System.out.println("getAllStudent");
        return STUDENTS;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("registrationStudent");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId,
                              @RequestBody Student student){
        System.out.println("alterStudent");
        System.out.println(String.format("%s %s",studentId,student));
    }
}
