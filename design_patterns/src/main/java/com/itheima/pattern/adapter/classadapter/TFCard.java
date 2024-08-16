package com.itheima.pattern.adapter.classadapter;

/**
 * @version v1.0
 * @ClassName: TFCard
 * @Description: 适配者类的接口
 * @Author: 黑马程序员
 */
public interface TFCard {

    /**
     * 从TF卡中读取数据
     *
     * @return string
     */
    String readTF();

    /**
     * 往TF卡中写数据
     *
     * @param msg 消息
     */
    void writeTF(String msg);
}
