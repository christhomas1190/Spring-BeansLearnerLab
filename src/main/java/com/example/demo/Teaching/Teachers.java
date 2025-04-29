package com.example.demo.Teaching;

import com.example.demo.Learning.Learner;

public interface Teachers {
   void teach(Learner learner, double numberOfHours);
   void lecture(Iterable<? extends Learner> learners,double numberOfHours);
}
