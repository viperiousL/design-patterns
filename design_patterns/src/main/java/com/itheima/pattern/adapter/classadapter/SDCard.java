package com.itheima.pattern.adapter.classadapter;

/**
 * @version v1.0
 * @ClassName: SDCard
 * @Description: 目标接口
 * @Author: 黑马程序员
 */
public interface SDCard {

    /**
     * 从SD卡中读取数据
     *
     * @return string
     */
    String readSD();

    /**
     * 往SD卡中写数据
     *
     * @param msg 消息
     */
    void writeSD(String msg);
}
