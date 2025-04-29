package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Instructors extends Person implements Teachers {

    public Instructors(Long id, String name){
        super(id,name);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

    }
}
