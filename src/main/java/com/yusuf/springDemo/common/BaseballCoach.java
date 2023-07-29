package com.yusuf.springDemo.common;

import org.springframework.stereotype.Component;

@Component

public class BaseballCoach implements Coach{
    public int count;
    public BaseballCoach() {
        System.out.println("In constructor : " + getClass().getName());
        count = 0;
    }
    @Override
    public String getDailyWorkout() {
        count += 1;
        return "do more stuff";
    }

}
