package com.itheima.pattern.factory.abstractfactory;

/**
 * @version v1.0
 * @ClassName: DessertFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public interface DessertFactory {

    /**
     * 生产咖啡的功能
     *
     * @return Coffee
     */
    Coffee createCoffee();

    /**
     * 生产甜品的功能
     *
     * @return Dessert
     */
    Dessert createDessert();
}
