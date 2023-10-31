package com.zzy.factoryPattern.abstractFactory;


import com.zzy.factoryPattern.entity.Coffee;
import com.zzy.factoryPattern.entity.Dessert;


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

    public Dessert orderDessert() {

        Dessert dessert = coffeeFactory.createDessert();

        return dessert;
    }

    public static void main(String[] args) {
        // 1.创建咖啡店类
        CoffeeStore store = new CoffeeStore();

        //创建具体的咖啡店工厂
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setCoffeeFactory(factory);

        // 2.点单
        Coffee americanCoffee = store.orderCoffee();
        Dessert dessert=  store.orderDessert();

        System.out.println(americanCoffee.getName());
        System.out.println(dessert.getName());
    }
}

