package com.home3;

import java.util.Collection;

/**
 * Created by Stacy on 1/29/16.
 */
public class SSuperBarista implements IBaker, IBarista {
    public Collection<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(Collection<Coffee> coffees) {
        this.coffees = coffees;
    }

    private Collection<Coffee> coffees;

    public Collection<ICake> getCakes() {
        return cakes;
    }

    public void setCakes(Collection<ICake> cakes) {
        this.cakes = cakes;
    }

    private Collection<ICake> cakes;
    @Override
    public void bakeCake() {
        for(ICake cake:cakes)
            cake.bake();
    }

    @Override
    public void makeCoffee() {
        for(Coffee coffee:coffees)
            coffee.make();
    }
}
