package com.itheima.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: HouseOwner
 * @Description: 具体的同事角色类
 * @Author: 黑马程序员
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 和中介联系（沟通）
     *
     * @param message 消息
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    /**
     * 获取信息
     *
     * @param message 消息
     */
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }
}
