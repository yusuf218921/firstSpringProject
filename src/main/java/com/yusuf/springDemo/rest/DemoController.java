package com.yusuf.springDemo.rest;

import com.yusuf.springDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anOtherCoach;

    @Autowired
    public void setCoach(@Qualifier("tennisCoach") Coach coach, @Qualifier("tennisCoach") Coach anOtherCoach) {
        System.out.println("In Constructor : " + getClass().getName());
        this.coach = coach;
        this.anOtherCoach = anOtherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coach == anotherCoach, " + (coach==anOtherCoach) + "\n" +
                "count: " + anOtherCoach.getDailyWorkout();
    }

}
