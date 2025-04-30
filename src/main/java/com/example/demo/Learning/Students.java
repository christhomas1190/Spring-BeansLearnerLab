package com.example.demo.Learning;

import com.example.demo.Humans.People;
import org.springframework.stereotype.Component;

@Component
public class Students extends People<Student> {
    public Students(Student... students){
        super(students);
    }
}
