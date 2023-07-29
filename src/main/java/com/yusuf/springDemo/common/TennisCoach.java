package com.yusuf.springDemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{
    public int count;

    public TennisCoach() {
        System.out.println("In constructor : " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        count += 1;
        return "do soma stuff, " + count;
    }
}
