package com.example.demo.Configurations;

import com.example.demo.Teaching.Instructor;
import com.example.demo.Teaching.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        return new Instructors((Instructor) List.of("Kris","Paul","Leon"));
    }
    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors((Instructor) List.of("James", "Victoria"));
    }
}
