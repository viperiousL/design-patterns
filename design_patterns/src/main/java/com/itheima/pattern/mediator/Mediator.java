package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: Mediator
 * @Description: 抽象中介者类
 * @Author: 黑马程序员
 */
public abstract class Mediator {

    public abstract void contact(String message, Person person);
}
