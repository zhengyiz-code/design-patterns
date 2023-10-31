package com.zzy.factoryPattern.simpleFactory;


import com.zzy.factoryPattern.entity.AmericanCoffee;
import com.zzy.factoryPattern.entity.Coffee;
import com.zzy.factoryPattern.entity.LatteCoffee;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        //声明 Coffee 类型的变量，根据不同类型创建不同的 coffee 子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }

}
