package com.zzy.factoryPattern.factoryMethod;

import com.zzy.factoryPattern.entity.Coffee;
import com.zzy.factoryPattern.entity.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
