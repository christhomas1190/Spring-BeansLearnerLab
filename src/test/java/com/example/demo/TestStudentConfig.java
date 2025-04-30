package com.example.demo;

import com.example.demo.Learning.Students;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudentsBean() {
        assertNotNull(currentStudents);
        System.out.println("Current Students: " + currentStudents.findAll());
    }

    @Test
    public void testPreviousStudentsBean() {
        assertNotNull(previousStudents);
        System.out.println("Previous Students: " + previousStudents.findAll());
    }
}
