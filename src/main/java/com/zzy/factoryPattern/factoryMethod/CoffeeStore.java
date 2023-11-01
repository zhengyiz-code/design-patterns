package com.zzy.factoryPattern.factoryMethod;


import com.zzy.factoryPattern.entity.Coffee;


public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {

        //调用生产咖啡的方法
        Coffee coffee = coffeeFactory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }


    public static void main(String[] args) {
        // 1.创建咖啡店类
        CoffeeStore store = new CoffeeStore();

        //创建具体的咖啡店工厂
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setCoffeeFactory(factory);

        // 2.点单
        Coffee americanCoffee = store.orderCoffee();


        System.out.println(americanCoffee.getName());

    }
}

