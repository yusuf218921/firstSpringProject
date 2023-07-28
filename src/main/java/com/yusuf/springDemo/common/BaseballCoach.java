package com.yusuf.springDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("In constructor : " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "do more stuff";
    }
}
