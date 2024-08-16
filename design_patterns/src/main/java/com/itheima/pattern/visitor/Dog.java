package com.itheima.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Cat
 * @Description: 具体元素角色类（宠物狗）
 * @Author: 黑马程序员
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        //访问者给宠物猫喂食
        person.feed(this);
        System.out.println("好好吃，汪汪汪。。。");
    }
}
