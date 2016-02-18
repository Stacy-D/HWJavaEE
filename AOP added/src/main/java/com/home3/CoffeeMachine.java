package com.home3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Stacy on 2/12/16.
 */
@Component
@Aspect
public class CoffeeMachine implements ICoffeeMachine {
    @Pointcut("execution(* com.home3.IBarista.makeCoffee(..))")
    void coffee(){}
    @Before("coffee()")
    public void turnCoffeeMOn(){
        System.out.println("Coffee machine is turned on, don`t forget to turn it off");
    }
    @After("coffee()")
    public void turnCoffeeMOff(){
        System.out.println("Coffee machine was turned off to save the electricity");
    }
}
