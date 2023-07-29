package com.yusuf.springDemo.rest;

import com.yusuf.springDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;


    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In Constructor : " + getClass().getName());
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }


}
