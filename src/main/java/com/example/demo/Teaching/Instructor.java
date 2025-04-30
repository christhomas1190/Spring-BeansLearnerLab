package com.example.demo.Teaching;

import com.example.demo.Learning.Learner;
import com.example.demo.Humans.Person;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Instructor extends Person {

        public Instructor(Long id, String name) {
            super(id, name);
        }

        public void teach(Learner learner, double numberOfHours) {
            learner.learn(numberOfHours);
        }

        public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
            int count = (learners instanceof Collection<?> c) ? c.size() : 0;
            double hoursPerLearner = count == 0 ? 0 : numberOfHours / count;

            for (Learner learner : learners) {
                learner.learn(hoursPerLearner);
            }
        }
    }

