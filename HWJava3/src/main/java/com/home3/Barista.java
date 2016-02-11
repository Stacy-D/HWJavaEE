package com.home3;

/**
 * Created by Stacy on 7/16/15.
 */
public class Barista implements IBarista {
    private Coffee coffee;
    public Barista (Coffee coffee){
        this.coffee = coffee;
    }
    public void makeCoffee(){
        this.coffee.make();
    }
}
