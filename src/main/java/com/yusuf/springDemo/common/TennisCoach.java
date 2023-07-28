package com.yusuf.springDemo.common;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor : " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "do soma stuff";
    }
}
