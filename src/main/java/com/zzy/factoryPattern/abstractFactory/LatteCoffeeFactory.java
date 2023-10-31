package com.zzy.factoryPattern.abstractFactory;


import com.zzy.factoryPattern.entity.*;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Dessert createDessert() {
        return new Matchamousse();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
