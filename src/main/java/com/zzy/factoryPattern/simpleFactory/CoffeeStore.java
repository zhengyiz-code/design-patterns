package com.zzy.factoryPattern.simpleFactory;


import com.zzy.factoryPattern.entity.Coffee;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

    public static void main(String[] args) {
        // 1.创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 2.点咖啡
        Coffee americanCoffee = store.orderCoffee("american");
        System.out.println(americanCoffee.getName());

        // 2.点咖啡
        Coffee latteCoffee = store.orderCoffee("latte");
        System.out.println(latteCoffee.getName());

    }
}

