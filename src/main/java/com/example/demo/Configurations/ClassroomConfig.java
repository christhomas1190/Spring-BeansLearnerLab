package com.example.demo.Configurations;

import com.example.demo.Classroom;
import com.example.demo.Learning.Students;
import com.example.demo.Teaching.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(
            @Qualifier("instructors") Instructors instructors,
            @Qualifier("students") Students students) {
        return new Classroom(instructors, students);
    }
    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(
            @Qualifier("instructors") Instructors instructors,
            @Qualifier("previousStudents") Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }

}
