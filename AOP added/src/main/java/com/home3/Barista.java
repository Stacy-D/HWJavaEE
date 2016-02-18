package com.home3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Stacy on 7/16/15.
 */
@Component
public class Barista implements IBarista {
    @Autowired @Qualifier("latte")
    private Coffee coffee;
    public void makeCoffee(){
        this.coffee.make();
    }
}
