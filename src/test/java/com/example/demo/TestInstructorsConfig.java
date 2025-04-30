package com.example.demo;

import com.example.demo.Configurations.InstructorsConfig;
import com.example.demo.Teaching.Instructors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InstructorsConfig.class)
public class TestInstructorsConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors") // the @Primary bean
    private Instructors allInstructors;

    @Test
    public void testTcUsaInstructorsBean() {
        assertNotNull(tcUsaInstructors);
        System.out.println("TechConnect USA Instructors: " + tcUsaInstructors.findAll());
    }

    @Test
    public void testTcUkInstructorsBean() {
        assertNotNull(tcUkInstructors);
        System.out.println("TechConnect UK Instructors: " + tcUkInstructors.findAll());
    }

    @Test
    public void testAllInstructorsPrimaryBean() {
        assertNotNull(allInstructors);
        System.out.println("All Instructors (Primary): " + allInstructors.findAll());
    }
}
