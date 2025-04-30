package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Test
    public void testCurrentCohortBean() {
        assertNotNull(currentCohort);
        System.out.println("Current Cohort - Students: " + currentCohort.getStudents().findAll());
    }
}
