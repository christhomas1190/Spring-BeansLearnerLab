package com.example.demo.Configurations;

import com.example.demo.Learning.Student;
import com.example.demo.Learning.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students((Student) List.of("Christian", "Jaimie", "Ginny", "Shyla"));
    }

    @Bean
    public Students previousStudents() {
        return new Students((Student) List.of("Jordan", "Taylor", "Skylar"));
    }
}

