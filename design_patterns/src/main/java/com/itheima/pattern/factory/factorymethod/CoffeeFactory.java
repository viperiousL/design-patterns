package com.itheima.pattern.factory.factorymethod;

/**
 * @version v1.0
 * @ClassName: CoffeeFactory
 * @Description: CoffeeFactory ： 抽象工厂
 * @Author: 黑马程序员
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡对象的方法
     *
     * @return coffee
     */
    Coffee createCoffee();
}
