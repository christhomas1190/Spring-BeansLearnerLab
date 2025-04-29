package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"students","instructors"})
public class Classroom {
    private Students student;
    private Instructors instructor;

    @Autowired
    public Classroom(Students student, Instructors instructor){
        this.student=student;
        this.instructor=instructor;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Classroom is not initialized with");
        student.listStudents();
        instructor.listInstructors();
    }

}
