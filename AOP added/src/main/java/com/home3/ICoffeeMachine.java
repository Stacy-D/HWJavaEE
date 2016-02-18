package com.home3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Stacy on 2/12/16.
 */
@Aspect
public interface ICoffeeMachine {


    void turnCoffeeMOn();
    void turnCoffeeMOff();
}
