package com.example.demo.Learning;

import com.example.demo.Humans.People;

public class Students extends People<Student> {
    public Students(Student... students){
        super(students);
    }
}
