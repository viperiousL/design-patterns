package com.itheima.pattern.proxy.staticproxy;

/**
 * @version v1.0
 * @ClassName: TrainStation
 * @Description: 火车站类
 * @Author: 黑马程序员
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
