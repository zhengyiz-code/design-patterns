package com.zzy.factoryPattern.abstractFactory;

import com.zzy.factoryPattern.entity.Coffee;
import com.zzy.factoryPattern.entity.Dessert;

public interface CoffeeFactory {

    Dessert createDessert();
    Coffee createCoffee();
}
