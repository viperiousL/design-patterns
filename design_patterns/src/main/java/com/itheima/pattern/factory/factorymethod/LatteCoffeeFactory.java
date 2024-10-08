package com.itheima.pattern.factory.factorymethod;

/**
 * @version v1.0
 * @ClassName: LatteCoffeeFactory
 * @Description: 拿铁咖啡工厂，专门用来生产拿铁咖啡
 * @Author: 黑马程序员
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
