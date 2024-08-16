package com.itheima.pattern.factory.simplefactory;

/**
 * @version v1.0
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Author: 黑马程序员
 */
public abstract class Coffee {
    /**
     * 获取名称
     *
     * @return string
     */
    public abstract String getName();

    /**
     * 加糖
     */
    public void addsugar() {
        System.out.println("加糖");
    }

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
