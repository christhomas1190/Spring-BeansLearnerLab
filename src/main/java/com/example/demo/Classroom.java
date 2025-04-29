package com.example.demo;

import com.example.demo.Learning.Students;
import com.example.demo.Teaching.Instructors;
import com.example.demo.Teaching.Teachers;

public class Classroom {
    private final Instructors instructors;
    private final Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teachers teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
