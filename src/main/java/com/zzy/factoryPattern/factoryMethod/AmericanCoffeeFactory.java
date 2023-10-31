package com.zzy.factoryPattern.factoryMethod;

import com.zzy.factoryPattern.entity.AmericanCoffee;
import com.zzy.factoryPattern.entity.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
