package com.home3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Stacy on 1/29/16.
 */

public class SuperBarista implements IBarista,IBaker{

    public ICake getCake() {
        return cake;
    }

    public void setCake(ICake cake) {
        this.cake = cake;
    }

    private ICake cake;


    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    private Coffee coffee;
    @Override
    public void makeCoffee() {
        coffee.make();
    }
    public SuperBarista(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void bakeCake() {
        cake.bake();
    }
}
