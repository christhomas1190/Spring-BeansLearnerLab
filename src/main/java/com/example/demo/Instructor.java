package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Instructor extends Person implements Teachers {

    public Instructor(Long id, String name){
        super(id,name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
     learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
    int numberOfLearners =0;
    for(Learner l: learners){
        numberOfLearners++;
    }
    double numberOfHoursPerLearner = numberOfHours/numberOfLearners;
        for(Learner l: learners){
            l.learn(numberOfHoursPerLearner);
        }
    }
}
