package com.zzy.factoryPattern.abstractFactory;


import com.zzy.factoryPattern.entity.AmericanCoffee;
import com.zzy.factoryPattern.entity.Coffee;
import com.zzy.factoryPattern.entity.Dessert;
import com.zzy.factoryPattern.entity.Trimisu;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
