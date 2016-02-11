package com.home3;

import org.springframework.stereotype.Component;

/**
 * Created by Stacy on 1/29/16.
 */
@Component
public class CheeseCake implements ICake {
    @Override
    public void bake() {
        System.out.println("Cheese cake is baking");
    }
}
