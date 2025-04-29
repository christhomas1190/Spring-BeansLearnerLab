package com.example.demo;

public interface Teachers {
   void teach(Learner learner, double numberOfHours);
   void lecture(Iterable<? extends Learner> learners,double numberOfHours);
}
