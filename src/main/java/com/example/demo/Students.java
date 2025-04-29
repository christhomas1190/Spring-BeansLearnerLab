package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Students extends Person implements Learner{
    private double totalStudyTime;

    public Students(Long id, String name){
        super(id, name);
        this.totalStudyTime=0;


    }

    public double totalStudyTime(){
        return totalStudyTime;
    }

    @Override
    public void learn(double numOfHours) {

    }
}
