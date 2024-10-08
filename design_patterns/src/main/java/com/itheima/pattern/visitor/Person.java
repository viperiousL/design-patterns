package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Person
 * @Description: 抽象访问者角色类
 * @Author: 黑马程序员
 */
public interface Person {

    /**
     * 喂食宠物狗
     *
     * @param cat 猫
     */
    void feed(Cat cat);

    /**
     * 喂食宠物猫
     *
     * @param dog 狗
     */
    void feed(Dog dog);
}
