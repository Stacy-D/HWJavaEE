package com.home3;

import org.springframework.stereotype.Component;

/**
 * Created by Stacy on 7/16/15.
 */
@Component
public class Latte implements Coffee {
    public void make(){
        System.out.println("Late is being made");
    }
}
