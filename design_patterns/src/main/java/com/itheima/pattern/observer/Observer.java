package com.itheima.pattern.observer;

/**
 * @version v1.0
 * @ClassName: Observer
 * @Description: 抽象观察者类
 * @Author: 黑马程序员
 */
public interface Observer {

    /**
     * 更新消息
     *
     * @param message 消息内容
     */
    void update(String message);
}
