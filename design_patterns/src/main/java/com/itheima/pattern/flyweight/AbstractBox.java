package com.itheima.pattern.flyweight;

/**
 * @version v1.0
 * @ClassName: AbstractBox
 * @Description: 抽象享元角色
 * @Author: 黑马程序员
 */
public abstract class AbstractBox {

    /**
     * 获取图形的方法
     *
     * @return String
     */
    public abstract String getShape();

    /**
     * 显示图形及颜色
     *
     * @param color 颜色
     */
    public void display(String color) {
        System.out.println("方块形状：" + getShape() + ", 颜色：" + color);
    }
}
