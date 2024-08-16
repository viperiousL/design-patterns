package com.itheima.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Builder
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public abstract class Builder {

    /**
     * 声明Bike类型的变量，并进行赋值
     */
    protected Bike bike = new Bike();

    /**
     * 造车架
     */
    public abstract void buildFrame();

    /**
     * 造座椅
     */
    public abstract void buildSeat();

    /**
     * 构建自行车的方法
     *
     * @return 自行车
     */
    public abstract Bike createBike();
}
